package com.simplilearn.estore.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontendController {
	
	@GetMapping("/")
	public String indexMapping() {
		return "Spring server is up & runing.";
	}
	
	@GetMapping("/greetings")
	public String greetingMapping(@RequestParam(name="status", required = false , defaultValue = "Bye Bye") String status) {
		return status + " everyone !";
	}

	@GetMapping("/user")
	public Map<String, String> userMapping(@RequestParam(name="username", required = false , defaultValue = "John") 
	String username , @RequestParam(name="password", required = false , defaultValue = "EMKS@1234$5") 
	String password) {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("username", username);
		userMap.put("password", password);
		return userMap;
	}
}
