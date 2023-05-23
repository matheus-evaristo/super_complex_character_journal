package org.noveltools.sccj.main;

import java.util.Date;

import org.noveltools.sccj.main.character.CharacterEntity;
import org.noveltools.sccj.main.character.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx, CharacterRepository repository) {
		return args -> {
			repository.save(
				new CharacterEntity(1L, "Phobos")
			);
		};
	}

}
