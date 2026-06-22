package willydekeyser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	 @Bean
	 SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	   	http
	   		.csrf(config -> config.disable())
	   		.securityContext(config -> config.disable())
	   		.sessionManagement(config -> config.disable())
	   		.headers(config -> config.disable())
	   		.exceptionHandling(config -> config.disable())
	   		.requestCache(config -> config.disable())
	   		.anonymous(config -> config.disable())
	   		.logout(config -> config.disable())
	   		.httpBasic(config -> config.disable())
	   		.formLogin(config -> config.disable())
	   		//.authorizeHttpRequests((authorize) -> authorize
            //        .requestMatchers("/").permitAll()
            //        .anyRequest().authenticated())
	   		;
	               
	    return http.build();
	 }

	 @Bean
	 WebSecurityCustomizer webSecurityCustomizer() {
	 	 return (web) -> web.ignoring().requestMatchers("/**");
	 }

}
