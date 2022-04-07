package campos.zulema.domain.weather.services;

import campos.zulema.domain.weather.models.WeatherApiResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
@Service
public class WeatherServiceImpl implements WeatherService{

    private RestTemplate restTemplate;

    public WeatherServiceImpl(){
        this.restTemplate = new RestTemplate();
    }

    @Override
    public Optional<WeatherApiResponse> requestDataFromApi(String lat, String lon) {
        try{
            String apiKey = "74e52166eff710e3cd972aaaa22b903d";
            String url = "https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s&units=imperial";
            String requestUrl = String.format(url,lat,lon,apiKey);
            ResponseEntity<WeatherApiResponse> response = restTemplate.exchange(requestUrl, HttpMethod.GET,null,WeatherApiResponse.class);
            WeatherApiResponse apiResponse = response.getBody();
            return Optional.of(apiResponse);
        } catch (HttpClientErrorException ex){
            return Optional.empty();
        }
    }
}
