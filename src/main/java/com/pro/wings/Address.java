package com.pro.wings;

public class Address {

    private String city;
    private String house;
    private int pin;

    public Address() {
    }

    public Address(String city, String house, int pin) {
        this.city = city;
        this.house = house;
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", house='" + house + '\'' +
                ", pin=" + pin +
                '}';
    }
}
