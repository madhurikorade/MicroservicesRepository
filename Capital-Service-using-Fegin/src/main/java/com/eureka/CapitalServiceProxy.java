package com.eureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="countries-service",url="localhost:8001")
public interface CapitalServiceProxy 
{
   @GetMapping("/country/{country}")	
   public CapitalsBean getCountry(@PathVariable("country") Integer country);
}
