package com.sampson.aulaspringjpa.service;

import com.sampson.aulaspringjpa.model.Address;
import com.sampson.aulaspringjpa.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAdresses(){
        return addressRepository.findAll();
    }
}
