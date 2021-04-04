package com.cognizant.MicroservicesHandsOn.Loan.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

	private long number;
	private String type;
	private long loan;
	private long emi;
	private int tenure;

}
