package com.sampson.aulaspringjpa.repository;

import com.sampson.aulaspringjpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
