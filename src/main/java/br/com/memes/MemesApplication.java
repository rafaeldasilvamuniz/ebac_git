package br.com.memes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class MemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaApplication.class, args);
	}

}
