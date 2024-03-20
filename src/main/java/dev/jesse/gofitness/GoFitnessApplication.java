package dev.jesse.gofitness;

import dev.jesse.gofitness.run.Location;
import dev.jesse.gofitness.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class GoFitnessApplication {

	private static final Logger log = LoggerFactory.getLogger(GoFitnessApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(GoFitnessApplication.class, args);
		log.info("GoFitnessApplication started successfully.");
	}

	//CLI Runner
	@Bean
	CommandLineRunner runner() {
		return args -> {
			log.info("Runner CLI started successfully.");
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5.0f, Location.OUTDOOR);
			log.warn("Run: " + run);
		};
	}

}
