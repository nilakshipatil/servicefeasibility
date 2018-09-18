package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.impl.FeasibilityService;
import com.service.model.AddressResponse;

@Controller
public class FeasibilityController {

	@Autowired
	FeasibilityService service;
	
	@RequestMapping(value="/getAreaByZipcode/zipcode/",method=RequestMethod.GET)
	public AddressResponse getAreaByZipcode(@PathVariable Integer zipcode) {
		AddressResponse response=new AddressResponse();
		service.getAddressByZipcode(zipcode);
		return response;
	}
	
}
