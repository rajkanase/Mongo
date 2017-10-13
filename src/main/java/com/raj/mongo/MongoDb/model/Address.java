package com.raj.mongo.MongoDb.model;

public class Address {

    String village;
    String taluka;
    String dist;
    String state;
    Integer pin;

    @Override
    public String toString() {
        return "Address{" +
                "village='" + village + '\'' +
                ", taluka='" + taluka + '\'' +
                ", dist='" + dist + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }



    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }



}
