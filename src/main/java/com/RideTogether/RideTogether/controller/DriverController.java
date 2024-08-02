package com.RideTogether.RideTogether.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
	
	
	@GetMapping("/drivername")
	public String getDriverName()
	{
		return "chitti";
	}
	

}
