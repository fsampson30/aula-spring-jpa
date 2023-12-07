package com.sampson.aulaspringjpa.controller;

import com.sampson.aulaspringjpa.model.Address;
import com.sampson.aulaspringjpa.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "/test")
    public List<Address> getAll(){
        return addressService.getAllAdresses();
    }
}
