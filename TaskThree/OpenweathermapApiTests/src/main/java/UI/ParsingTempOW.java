package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ParsingTempOW{

    private WebDriver driver;
    private String url;

    public ParsingTempOW(){
        url="https://openweathermap.org/city/466806";
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
    }

    public int TempCurrent(){
        driver.get(url);
        String temp = driver.findElement(By.xpath("//span[@class='heading'][contains(text(), 'C')]")).getText();
        temp = temp.replaceAll("°C", "");
        driver.quit();
        int j = Integer.valueOf(temp);
        return j;
    }
}
