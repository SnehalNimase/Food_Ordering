package com.flavourHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavourHub.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
