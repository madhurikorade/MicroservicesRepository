package com.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.entity.Countries;
import com.eureka.service.CountriesService;

@RestController
@RequestMapping("/country")
public class CountriesController 
{
   @Autowired
   private CountriesService service;
   
   @GetMapping("/{country}")
   public Countries getCountry(@PathVariable Integer country)
   {
	   Countries coun=service.getCountryById(country);
	   if(coun==null)
	   {
		   System.out.println("country not found");
	   }
	   return coun;
   }
}
