package campos.zulema;

import campos.zulema.domain.weather.models.WeatherApiResponse;
import campos.zulema.domain.weather.services.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
@SpringBootApplication
public class   DashboardApiApplication implements CommandLineRunner {
	private static Logger log = LoggerFactory.getLogger(DashboardApiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DashboardApiApplication.class, args);
	}

	@Autowired
	private WeatherService weatherService;

	@Override
	public void run(String... args) throws Exception {
		Optional<WeatherApiResponse> reponse = weatherService.requestDataFromApi("39.7447", "-75.5484");
		if(reponse.isEmpty()){
			log.info("No Beuno");
			return;
		}
		WeatherApiResponse data = reponse.get();
		log.info(data.toString());
	}
}
