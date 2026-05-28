package willydekeyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug=true)
public class SpringBootSecurityFiltersPart32Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityFiltersPart32Application.class, args);
	}

}
