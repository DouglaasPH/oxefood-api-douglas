package br.edu.ifpe.oxefood_api_douglas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OxefoodApiDouglasApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiDouglasApplication.class, args);
	}

}
