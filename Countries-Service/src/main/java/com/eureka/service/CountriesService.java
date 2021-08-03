package com.eureka.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.entity.Countries;
import com.eureka.repository.CountriesRepository;

@Service
public class CountriesService
{
   @Autowired
   private CountriesRepository repo;
   
     public Countries getCountryById(Integer country)
     {
		// TODO Auto-generated method stub
		Optional<Countries> findById = repo.findById(country);
		if(findById.isPresent())
		{
			return findById.get();
		}
		else
			return null;
	}

}
