package com.example.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.example.ws.HelloWorld")
public class HelloWorldImp implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		return "Hello World JAX-WS " + name;
	}	
}
