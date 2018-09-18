package com.service.impl;

import com.service.model.AddressResponse;

public interface FeasibilityService {
	public AddressResponse getAddressByZipcode(int zipcode);
		
}
