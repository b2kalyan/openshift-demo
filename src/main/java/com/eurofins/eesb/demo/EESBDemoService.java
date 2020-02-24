package com.eurofins.eesb.demo;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EESBDemoService {
	
	public static String ROOT_PATH = "/var/ftp/application/pub/";
	
	@GetMapping(path="/id")
	public String getRandomId() {
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return ROOT_PATH + UUID.randomUUID().toString();
	}
}
