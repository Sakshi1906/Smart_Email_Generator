package com.email.writer.app;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;

@Data
public class EmailRequest {
	private String emailContent;
	private String tone;	

}
