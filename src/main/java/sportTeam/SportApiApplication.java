package sportTeam;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "sportTeam.repository")
public class SportApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportApiApplication.class, args);
	}

}
