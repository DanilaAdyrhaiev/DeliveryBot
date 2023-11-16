package com.DeliveryBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DeliveryBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryBotApplication.class, args);
		new Scanner(System.in).nextLine();
	}

}
