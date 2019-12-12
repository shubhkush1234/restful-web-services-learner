This is a SpringBoot project created with start.spring.io
location of main class: /restful-web-services/src/main/java/com/shubham/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java

So, after initial setup, we'll create rest controller which will return some hardcoded test. We'll calll it as HelloWorld RESTful web service.

so, will create a new class HelloWorldController.

Whenever we'd create REST service, we need to define 2 things:
1. What method you want to choose
2. What URI you want to use

In this case, we'd use Get method and if someone click the uri /hello-world we want to send text "Hello World".

we'll tell the rest MVC that it's a controller by adding annotation- "@RestController" on top of the class.
Next thing that we want is to map the helloWorld method to the URI:"/hello-world"
We'll do it by adding an annotation: "@RequestMapping". Inside that we'll define which method we want to use and what will be the path of this. So, whatever is returned by this "helloWorld()" will be visible on the browser.
============================================================
//Controller
@RestController
public class HelloWorldController {

	//GET
	// URI- /hello-world
	//Method- "helloWorld"
	@RequestMapping(method = RequestMethod.GET,path = "/hello-world" )
	public String helloWorld(){
		return "Hello World, I am created by Shubham!!";
	}
}
==================================================

Spring provides another annotation:"@GetMapping" for GET and similarly for POST its "@PostMapping" and so on. So now no need to specify method=RequestMethod.GET now.
=======================================
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
======================================= 
Enhancing the HellowWorldController
:::::::::::::::::::::::::::::::::::
In the previous step, we returned a hard-coded String. We made get request. We mapped GET request to the URI to the method which returned a hardcoded string.

In this step, Now, we'll create an object of the HelloWorld bean and try to return it back and see what happens.

!!A LOT OF MAGIC IS HAPPENING IN THE BACKGROUND!!

Now what I want to do is to create a GET mapping to "/helloWorldBean" and thisi time I want to create a bean and return it back.

======================================================
@GetMapping( path = "/hello-world-bean" )
	public HelloWorldBean helloWorldBean(){
		return new HelloWorldBean(" Hello Shubham ");
	}

======================================================
So, instead of returning a String, now it's returning a helloWorldBean. Lets create that bean too and generate Getters, Setters and toString for this:
======================================================
package com.shubham.rest.webservices.restfulwebservices;

public class HelloWorldBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public HelloWorldBean(String message){
		this.message = message;
	}
	
}
=============================================
Now when we'll hit: http://localhost:8080/hello-world-bean in the browser, well get:
===================================
{"message":" Hello Shubham "}
===================================