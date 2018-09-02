package com.lcntest.lcnt4.lcnt44.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test44Controller {

	@GetMapping("/hello")
	public String hello(){
		return "hello test 44";
	}
}
