package org.springframework.chapter1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {

	public String greetuser() {
		return "Welcome to Chapter-1 of book Learning Spring Application Developemnt";
	}

}
