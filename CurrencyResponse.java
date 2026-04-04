package com.example.CurrencyConverter;

public class CurrencyResponse {

	private double amount;
	private String from;
	private String to;
	private double convertAmount;
	
	public CurrencyResponse(double amount, String from, String to, double convertAmount) {
		this.amount = amount;
		this.from = from;
		this.to = to;
		this.convertAmount = convertAmount;
	}
	
	public double getAmount() { return amount; }
	public String getFrom() {return from;}
	public String getTo() {return to;}
	public double getConvertAmount() {return convertAmount;}

}
