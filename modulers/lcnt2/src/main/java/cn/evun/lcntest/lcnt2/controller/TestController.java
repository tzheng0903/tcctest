package cn.evun.lcntest.lcnt2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello") 
	public String hello(){
		return "hello world!springboot application....";
	}
}
