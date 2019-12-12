package com.shubham.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//GET
	// URI- /hello-world
	//Method- "helloWorld"
	@GetMapping( path = "/hello-world" )
	public String helloWorld(){
		return "Hello World, I am created by Shubham!!";
	}
}

