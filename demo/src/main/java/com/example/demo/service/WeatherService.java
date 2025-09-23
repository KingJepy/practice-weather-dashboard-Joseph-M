package com.example.demo.service;

import com.example.demo.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String API_KEY = "016d68f805404a1f9fd202555252309";
    private static final String BASE_URL = "http://api.weatherapi.com/v1/current.json";

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeather(String city) {
        String url = BASE_URL + "?key=" + API_KEY + "&q=" + city;
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
