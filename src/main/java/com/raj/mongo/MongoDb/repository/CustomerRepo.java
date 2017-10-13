package com.raj.mongo.MongoDb.repository;

import com.raj.mongo.MongoDb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends MongoRepository<Customer,String> {
    Customer findByCustName(String name);

    void deleteByCustName(String name);

    Customer findByCustCity(String city);

    void deleteByCustCity(String city);
}
