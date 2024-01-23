package in.ashokit.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest_C {
	
	@GetMapping("/")
	public String greetmsg() {
		
		String msg = "Good Morning !!";
		
		return msg;
	}
	
	

}
