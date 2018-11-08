package ua.edu.ukma.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/api")
	public String index() {
		return "Api";
	}

}
