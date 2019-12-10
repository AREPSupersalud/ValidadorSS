package edu.eci.arep.ValidadorSS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ValidadorSsApplication {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> getIndex() {
		return new ResponseEntity<>("Validator SS", HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(ValidadorSsApplication.class, args);
	}

}
