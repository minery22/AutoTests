package controllers;

import models.openweathermap.ModelOpenWeathermap;

import models.weatherstack.ModelWeatherstack;
import org.springframework.web.client.RestTemplate;

public class WeatherController {
    private RestTemplate restTemplate;

    public WeatherController(){
        restTemplate = new RestTemplate();
    }

    private String API_BASE_OPENWEATHER = "http://api.openweathermap.org/";
    private String API_BASE_WEATHERSTACK = "http://api.weatherstack.com/";
    private String appid ="36fbf3e7c8c9b12fd2dda2e49f792f05";
    private String access_key = "f14bd4514d95bf663c961b43d455f52b";

    public ModelOpenWeathermap getOpenweathermap(String city) {
        try {
            return restTemplate.getForObject(API_BASE_OPENWEATHER+"data/2.5/weather?q="+city+"&units=metric&appid="+appid, ModelOpenWeathermap.class);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public ModelWeatherstack getWeatherstack(String city) {
        try {
            return restTemplate.getForObject(API_BASE_WEATHERSTACK+"current?access_key="+access_key+"&query="+city, ModelWeatherstack.class);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}


