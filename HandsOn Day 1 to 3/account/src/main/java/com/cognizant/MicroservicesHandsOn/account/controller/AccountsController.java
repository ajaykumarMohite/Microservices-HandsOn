package com.cognizant.MicroservicesHandsOn.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.MicroservicesHandsOn.account.model.Account;

@RestController
public class AccountsController {
	
	@GetMapping("accounts/{number}")
	public Account method(@PathVariable("number") long number) {
		return new Account(number,"savings",234343);
		
	}
	
	
}
