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

 
