import controllers.WeatherController;
import models.openweathermap.ModelOpenWeathermap;
import models.weatherstack.ModelWeatherstack;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWeatherComparison {

    public WeatherController weatherController;

    @BeforeTest
    public void setUp() {
        weatherController = new WeatherController();
    }
    //weather comparison of two services API (current Temperature)
    @Test
    public void testCompareTheWeatherCurrent(){
        ModelOpenWeathermap modelTempOpenWeather = weatherController.getOpenweathermap("Yoshkar-Ola");
        ModelWeatherstack modelTempWeatherstack = weatherController.getWeatherstack("Yoshkar-Ola");
        Assert.assertTrue(modelTempOpenWeather.getMain().getTemp() == (int)modelTempWeatherstack.getCurrent().getTemperature());
    }
    //weather comparison of two services API (feels_like)
    @Test
    public void testCompareTheWeatherFeels_like(){
        ModelOpenWeathermap modelTempOpenWeather = weatherController.getOpenweathermap("Yoshkar-Ola");
        ModelWeatherstack modelTempWeatherstack = weatherController.getWeatherstack("Yoshkar-Ola");
        Assert.assertTrue(modelTempOpenWeather.getMain().getFeelsLike() == (double)modelTempWeatherstack.getCurrent().getFeelslike());
    }
    //weather comparison of two services API (wind_speed)
    @Test
    public void testCompareTheWeatherWind_Speed(){
        ModelOpenWeathermap modelTempOpenWeather = weatherController.getOpenweathermap("Yoshkar-Ola");
        ModelWeatherstack modelTempWeatherstack = weatherController.getWeatherstack("Yoshkar-Ola");
        Assert.assertTrue(modelTempOpenWeather.getWind().getSpeed() == modelTempWeatherstack.getCurrent().getWindSpeed());
    }
}
