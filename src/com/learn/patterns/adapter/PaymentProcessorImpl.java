package com.learn.patterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public String pay(int dollars) {
		return "Payment of " + dollars + " completed";
	}

}
