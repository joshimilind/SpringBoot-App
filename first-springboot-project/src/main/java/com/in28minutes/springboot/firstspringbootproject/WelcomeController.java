package com.in28minutes.springboot.firstspringbootproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// from welcome service
	private WelcomeService service = new WelcomeService();

	@RequestMapping("/welcome")
	public String welcome() {
		// return "welcome from welcomeController";
		return service.retriveWelcomeMessege();
	}
}

class WelcomeService {
	public String retriveWelcomeMessege() {
		return "hello from welcomeService";
	}
}