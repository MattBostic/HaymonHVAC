package com.mb.HaymonHVAC.address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,String> {
    Address findByStreet(String street);

    Address findByCounty(String county);

    Address findByZipCode(int zip);

    Address findByCity(String city);
}
