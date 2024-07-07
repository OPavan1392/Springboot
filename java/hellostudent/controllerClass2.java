package hellostudent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controllerClass2 {
	
	@GetMapping("/hellostudent")
	public String HelloStudent(){
		return "Hello Student";
	}
	
	

}
