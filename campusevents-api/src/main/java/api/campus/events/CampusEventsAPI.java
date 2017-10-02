package api.campus.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CampusEventsAPI {

	public static void main(String[] args) {
		
		SpringApplication.run(CampusEventsAPI.class, args);
	}

}
