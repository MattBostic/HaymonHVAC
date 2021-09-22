package com.mb.HaymonHVAC.address;

public interface AddressService {

    void persistAddress(Address address);
    Address findByStreet(String street);
    Address findByCity(String city);
    Address findByZipCode(int zip);
    Address findByCounty(String county);



}
