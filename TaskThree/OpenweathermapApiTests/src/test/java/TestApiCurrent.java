import UI.ParsingTempOW;
import controllers.WeatherController;
import models.openweathermap.ModelOpenWeathermap;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestApiCurrent {
    public WeatherController weatherController;
    public ParsingTempOW parsingTempOW;

    @BeforeTest
    public void setUp() {
        weatherController = new WeatherController();
        parsingTempOW = new ParsingTempOW();
    }
    @Test
    public void TestCurrentAPIandUI(){
        ModelOpenWeathermap modelTempOpenWeather = weatherController.getOpenweathermap("Yoshkar-Ola");
        Assert.assertTrue(modelTempOpenWeather.getMain().getTemp() == parsingTempOW.TempCurrent());
    }
}
