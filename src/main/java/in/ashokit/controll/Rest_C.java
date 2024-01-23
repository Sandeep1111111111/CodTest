package in.ashokit.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest_C {
	
	@GetMapping("/")
	public String getwelcome() {
		
		String msg = "Welcome to home";
		
		return msg;
	}
	
	

}
