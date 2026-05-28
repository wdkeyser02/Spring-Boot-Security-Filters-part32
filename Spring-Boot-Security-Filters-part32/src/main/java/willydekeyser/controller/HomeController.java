package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
    public String home_page() {
        
        return "HOME PAGE";
    }
	
	@GetMapping("/public")
    public String pubic_page() {
        
        return "PUBLIC PAGE";
    }
	
	@GetMapping("/private")
    public String private_page() {
        
        return "PRIVATE PAGE";
    }
}
