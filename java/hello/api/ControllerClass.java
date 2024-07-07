package hello.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/")
	public String  hello() {
		return "Hello";
		
	}
	@GetMapping("/hello")
	public String helloStudent(){
		return "hello student";
		
	}
	@PostMapping("/hello")
	public String helloforPost(@RequestBody String data)
	{
		return "Server : Received data from you =>"+data;
	}
	

}
