package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.LogLevel;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		String name="Indhu";
		System.out.println("This is "+name);
		SpringApplication.run(DemoApplication.class, args);
	}
}
