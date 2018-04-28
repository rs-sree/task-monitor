package com.taskmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;

@SpringBootApplication
public class TaskMonitorApplication {

	@Bean
	public SimpleMailMessage templateSimpleMessage() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setText("This is the test email template for your email:\n%s\n");
		return message;
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskMonitorApplication.class, args);
	}
}
