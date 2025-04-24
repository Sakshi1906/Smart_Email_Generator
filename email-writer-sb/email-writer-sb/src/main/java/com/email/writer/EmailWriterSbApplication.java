package com.email.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailWriterSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailWriterSbApplication.class, args);
	}

}


//netstat -ano | findstr :8080
//taskkill /PID 12345 /F