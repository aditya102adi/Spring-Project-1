package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintProject1Application {

	public static void main(String[] args) {
		ApplicationContext ioc = SpringApplication.run(SprintProject1Application.class, args);
		
		Laptop laptop = ioc.getBean(Laptop.class);
		OperatingSystem os = ioc.getBean(OperatingSystem.class);
		
		
		laptop.setBrand("HP");
		laptop.setPrince(45000);
		laptop.setProcessor("RYZEN 5");
		laptop.setRamSize(16);
		
		os.setName("Windows 11");
		os.setVersion("12.1");
		
		laptop.displayDetails();
		
	}

}
