package campos.zulema.domain.weather.repos;

import campos.zulema.domain.weather.models.WeatherApiResponse;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WeatherRepo {
    Optional<WeatherApiResponse> findByLatAndLon(String lat, String lon);
}
