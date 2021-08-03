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
	private CapitalService service;
	
	@GetMapping("/country/{country}")
	public CapitalsBean getCountry(@PathVariable Integer country)
	{
		System.out.println("hiii");
		//response.setCountryId(country);
		CapitalsBean response=service.getCountryFromCountryService(country);
		return response;
	}
}
