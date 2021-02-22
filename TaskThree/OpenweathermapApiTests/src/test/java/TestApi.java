import controllers.WeatherController;
import models.openweathermap.ModelOpenWeathermap;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestApi {
    public WeatherController weatherController;

    @BeforeTest
    public void setUp() {
        weatherController = new WeatherController();
    }
    @Test
    public void testStatusCodeInfoResonse(){
        ModelOpenWeathermap modelTemp = weatherController.getOpenweathermap("Yoshkar-Ola");
        Assert.assertTrue(modelTemp.getCod() == 200);
    }
    // response city Yoshkar-ola
    @Test
    public void testCityInfoResponse() {
        ModelOpenWeathermap modelTempOpenWeather = weatherController.getOpenweathermap("Yoshkar-Ola");
        Assert.assertTrue(modelTempOpenWeather.getName().contains("Yoshkar-Ola"));
    }
    // response country RU
    @Test
    public void testCountryInfoResponse(){
        ModelOpenWeathermap modelTempOpenWeather = weatherController.getOpenweathermap("Yoshkar-Ola");
        Assert.assertTrue(modelTempOpenWeather.getSys().getCountry().contains("RU"));
    }
    //checking coordinates
    @Test
    public void testСoordinatesInfoResonse(){
        ModelOpenWeathermap modelTempOpenWeather = weatherController.getOpenweathermap("Yoshkar-Ola");
        Assert.assertTrue(modelTempOpenWeather.getCoord().getLon() == 47.8908);
        Assert.assertTrue(modelTempOpenWeather.getCoord().getLat() == 56.6388);
    }
}
