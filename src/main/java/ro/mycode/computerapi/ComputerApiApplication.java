package ro.mycode.computerapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.computerapi.model.Computer;
import ro.mycode.computerapi.repository.ComputerRepo;

@SpringBootApplication
public class ComputerApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ComputerApiApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ComputerRepo computerRepo){
		return  args->{
			Computer computer1=new Computer("Asus",4000,"laptop");
			Computer computer2=new Computer("Hp",8000,"pc");
		};
	}

}




