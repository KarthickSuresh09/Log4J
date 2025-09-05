package com.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contoller {

	static Logger s=Logger.getLogger(contoller.class);
	
	@GetMapping(value="/check")
	public String get() {
		
		s.info("No problem");
		s.warn("Have little bit error");
		s.trace("check detailed");
		s.debug("go and check");
		s.error("unable to run");
		
		return "Hello World";
	}
	
}
