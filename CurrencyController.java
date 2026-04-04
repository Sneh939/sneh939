package com.example.CurrencyConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CurrencyController {
	
	@Autowired
	private CurrencyService service;
	
	@GetMapping("/convert")
	public CurrencyResponse convert(
			@RequestParam double amount,
			@RequestParam String from,
			@RequestParam String to)
	{
		double result = service.convert(amount, from, to);
		
		return new CurrencyResponse(amount, from, to, result);
		
	}

}
