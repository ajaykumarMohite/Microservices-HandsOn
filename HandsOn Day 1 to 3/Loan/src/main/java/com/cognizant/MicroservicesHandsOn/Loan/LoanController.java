package com.cognizant.MicroservicesHandsOn.Loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.MicroservicesHandsOn.Loan.account.model.Loan;

@RestController
public class LoanController {
	
	@GetMapping("loans/{number}")
	public Loan method(@PathVariable("number") long number) {
		return new Loan(number,"savings",234343,2000,14);
		
	}
	
	
}
