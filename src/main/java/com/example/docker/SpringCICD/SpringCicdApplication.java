package com.example.docker.SpringCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCicdApplication {
	
	@GetMapping("/welcome")
	public String welcome() {

		return "Welcome to JAVA Spring CI/CD!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCicdApplication.class, args);
	}

}

//	git init
//	git add README.md
//		git commit -m "first commit"
//		git branch -M master
//		git remote add origin https://github.com/archanasantoshwhatkar/SpringCICD.git
//		git push -u origin master
