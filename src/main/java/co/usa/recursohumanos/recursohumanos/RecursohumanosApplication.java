package co.usa.recursohumanos.recursohumanos;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan (basePackages = {"co.usa.recursohumanos.recursohumanos.model"})
@SpringBootApplication
public class RecursohumanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecursohumanosApplication.class, args);
	}
	//Con la instruccion @EntityScan le decimos donde debe escanear 
}
