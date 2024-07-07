package HelloStudent3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStudent {
	
	@GetMapping("/hello3")
	public String helloStudent3() {
		return "Student3";}

}
