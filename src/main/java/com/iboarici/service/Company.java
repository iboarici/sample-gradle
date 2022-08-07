package com.iboarici.service;

public class Company {

    private final String name;
    private final Long taxNumber;
    private final String address;

    public Company(String name, Long taxNumber, String address) {
        this.name = name;
        this.taxNumber = taxNumber;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", taxNumber=" + taxNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
