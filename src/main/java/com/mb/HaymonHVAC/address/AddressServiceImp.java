package com.mb.HaymonHVAC.address;

import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImp implements AddressService{
    @Autowired
    private AddressRepository repo;

    @Override
    public void persistAddress(Address address) {
        repo.save(address);
    }

    @Override
    public Address findByStreet(String street) {
        return repo.findByStreet(street);
    }

    @Override
    public Address findByCity(String city) {
        return repo.findByCity(city);
    }

    @Override
    public Address findByZipCode(int zip) {
        return repo.findByZipCode(zip);
    }

    @Override
    public Address findByCounty(String county) {
        return repo.findByCounty(county);
    }
}
