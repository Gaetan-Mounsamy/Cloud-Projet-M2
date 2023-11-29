package Simone.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "nyaaaaaa", defaultValue = "OwO") String name) {
		return String.format("UwU %s!", name);
	}
}
