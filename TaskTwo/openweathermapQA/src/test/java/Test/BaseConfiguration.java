package Test;

import BasePage.AuthorizationBase;
import BasePage.BaseMetods;
import BasePage.ConversionBase;
import BasePage.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;


public class BaseConfiguration {

    WebDriver driver;
    public Main main;
    public BaseMetods baseMetods;
    public AuthorizationBase authorizationBase;
    public ConversionBase conversionBase;

    @BeforeClass
    @Parameters("browser")
    public void Initialzation (String browser) {

        if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            main = PageFactory.initElements(driver, Main.class);
            baseMetods = PageFactory.initElements(driver, BaseMetods.class);
            authorizationBase = PageFactory.initElements(driver, AuthorizationBase.class);
            conversionBase = PageFactory.initElements(driver, ConversionBase.class);
        }
        else if (browser.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            main = PageFactory.initElements(driver, Main.class);
            baseMetods = PageFactory.initElements(driver, BaseMetods.class);
            authorizationBase = PageFactory.initElements(driver, AuthorizationBase.class);
            conversionBase = PageFactory.initElements(driver, ConversionBase.class);
        }
    }
    @AfterClass
    public void Finish(){
        driver.quit();
    }
}
