package com.demo.service;

import org.springframework.stereotype.Component;

@Component
public class Aservice {
	private BService bService;
	public Aservice() {
		System.out.println("Aservice init.......");
	}
	public void send() {
		System.out.println("hhhhhhhh");
	}
}
