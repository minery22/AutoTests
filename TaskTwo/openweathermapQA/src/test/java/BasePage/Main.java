package BasePage;

import org.openqa.selenium.WebDriver;

public class Main extends BaseMetods{
    String SITE_URL = "https://openweathermap.org/";
    public Main(WebDriver driver) {
        super(driver);
    }
    public Main GoTo(){
        driver.get(SITE_URL);
        return this;
    }

    public Main CookiesDelete(){
        driver.manage().deleteAllCookies();
        return this;
    }

}
