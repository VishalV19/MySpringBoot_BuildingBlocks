package com.springboot.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

		//Simple Method
	// URI - /hellowworld
	//GET
	//@RequestMapping(method = RequestMethod.GET,  path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "Hellow World";
		
		}

	@GetMapping("/helloword-bean")
	public UserDetails hellowWorldBean() {
		return new UserDetails("Vishal", "Singh","USA");
	}





}
