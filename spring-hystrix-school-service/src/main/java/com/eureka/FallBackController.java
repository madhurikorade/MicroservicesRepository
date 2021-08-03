package com.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FallBackController 
{
	@GetMapping("/countryFallBack")
    public String countryServiceFallBack()
    {
    	return "country service its taking too long to respond or is down.please try again later";
    }
	@GetMapping("/capitalFallBack")
    public String capitalServiceFallBack()
    {
    	return "capital service its taking too long to respond or is down.please try again later";
    }
}
