package com.learn.patterns.adapter;

public class PaymentAdapter {

	public String pay(int rupees) {
		PaymentProcessor payment = new PaymentProcessorImpl();
		return payment.pay(rupees / 83);
	}

}
