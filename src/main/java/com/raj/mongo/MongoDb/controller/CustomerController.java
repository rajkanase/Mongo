package com.raj.mongo.MongoDb.controller;

import com.raj.mongo.MongoDb.model.Address;
import com.raj.mongo.MongoDb.model.Customer;
import com.raj.mongo.MongoDb.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @PostMapping("/insertmongo")
    String insertmongo(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "inserted";
    }

    @DeleteMapping("/deletemongo")
    String deletemongo(@RequestParam String id){
        customerRepo.delete(id);
        return "deleted";
    }

    @GetMapping("/getallmongo")
    List<Customer> getallmongo(){
        List<Customer> list=customerRepo.findAll();
        return list;
    }

    @GetMapping("/getonemongo")
    Customer getonemongo(@RequestParam String id){
        Customer customer=customerRepo.findOne(id);
        return customer;
    }

    @GetMapping(value = "findbyname")
    Customer findbyname(@RequestParam String name){
        Customer customer=customerRepo.findByCustName(name);
        return customer;
    }

    @GetMapping(value = "deletebyname")
    String deletebyname(@RequestParam String name){
        customerRepo.deleteByCustName(name);
        return "delete by name";
    }


    @GetMapping(value = "findbycity")
    Customer findbycity(@RequestParam String city){
        Customer customer=customerRepo.findByCustCity(city);
        return customer;
    }

    @GetMapping(value = "deletebycity")
    String deletebycity(@RequestParam String city){
        customerRepo.deleteByCustCity(city);
        return "delete by name";
    }

    @GetMapping(value = "/getonlyorders")
    List<String> getonlyorders(@RequestParam String id){
        Customer c=customerRepo.findOne(id);
        List<String> list=c.getOrders();
        return list;
    }

    @GetMapping(value = "getonlyaddresses")
    List<Address> getonlyaddresses(@RequestParam String id){
        Customer cust=customerRepo.findOne(id);
        List<Address> list=cust.getAddresses();
        return list;
    }

    @PostMapping(value = "addorder")
    String addorder(@RequestParam String id, @RequestParam String ord){
        Customer cust=customerRepo.findOne(id);
        List<String> li=cust.getOrders();
        li.add(ord);
        cust.setOrders(li);
        customerRepo.save(cust);
        return "Added order";
    }

}
