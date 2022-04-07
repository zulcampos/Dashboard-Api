package campos.zulema.domain.weather.services;

import campos.zulema.domain.weather.models.WeatherApiResponse;

import java.util.Optional;

public interface WeatherService {
    Optional<WeatherApiResponse> requestDataFromApi(String lat, String lon);
}
