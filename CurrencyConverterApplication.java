package com.example.CurrencyConverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyConverterApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(CurrencyConverterApplication.class, args);
    }
}

// http://localhost:8080/api/convert?amount=1000&from=INR&to=USD