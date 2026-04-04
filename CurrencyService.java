package com.example.CurrencyConverter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
	
	private final Map<String, Map<String, Double>> rates = new HashMap<>();
	
	public CurrencyService() {
		
		Map<String, Double> inrRates = new HashMap<>();
		inrRates.put("USD", 0.012);
		inrRates.put("EUR", 0.011);
		inrRates.put("INR", 1.0);
		
		Map<String, Double> usdRates = new HashMap<>();
		usdRates.put("INR", 82.75);
		usdRates.put("EUR", 0.92);
		usdRates.put("USD", 1.0);
		
		Map<String, Double> eurRates = new HashMap<>();
		eurRates.put("INR", 86.65);
		eurRates.put("USD", 1.08);
		eurRates.put("EUR", 1.0);
		
		rates.put("INR", inrRates);
		rates.put("USD", usdRates);
		rates.put("EUR", eurRates);
	}
	
	public double convert(double amount, String from, String to) {
		
		if(amount <0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}
		
		from = from.toUpperCase();
		to = to.toUpperCase();
		
		if(!rates.containsKey(from) || !rates.get(from).containsKey(to)) {
			throw new IllegalArgumentException("Invalid currency");
		}
		
		return amount * rates.get(from).get(to);
	}

}
