package com.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aws {
	@GetMapping("/findUs")
	public String to() {
		return  "BEAUTIFUL AWS";
	}
	

}
