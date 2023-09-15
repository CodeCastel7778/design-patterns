package com.learn.patterns.adapter;

public class PaymentApp {

	public void pay(int rupees) {
		PaymentAdapter adapter = new PaymentAdapter();
		String pay = adapter.pay(rupees);
		System.out.println(pay);
	}

	public static void main(String[] args) {
		PaymentApp app = new PaymentApp();
		app.pay(10000);
	}

}
