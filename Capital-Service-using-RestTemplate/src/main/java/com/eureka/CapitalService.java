package com.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class CapitalService
{
	@Autowired
     private RestTemplate template;
	
	   
	   public CapitalsBean getCountryFromCountryService(Integer country)
	   {
		  
		   CapitalsBean  response=template.getForObject("http://localhost:3306/countries",CapitalsBean.class);
		   return response;
		  
	   }
}
