package com.example.ws.endpoint;

import javax.xml.ws.Endpoint;

import com.example.ws.HelloWorldImp;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImp());

	}

}
