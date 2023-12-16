package com.element;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> msg(){
		
		String txtmsg="Hi welcome to 4ElementSoftech";
		
		return new ResponseEntity<>(txtmsg,HttpStatus.OK);
		
	}

}
