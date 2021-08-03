package com.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/capital")
public class CapitalServiceController
{
	@Autowired
    private CapitalServiceProxy proxy;
	CapitalsBean response;
	
	@GetMapping("/country/{country}")
	public CapitalsBean getCountry(@PathVariable Integer country)
	{
		//response.setCountryId(country);
		CapitalsBean response=proxy.getCountry(country);
		return response;
	}
}
