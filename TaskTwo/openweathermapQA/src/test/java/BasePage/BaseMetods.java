package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseMetods {
    public WebDriver driver;
    public WebDriverWait wait;


    public BaseMetods(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void waitIVisibility(By elementBy){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
    }
    public void ElementDisplayed(By elementBy){
        waitVisibility(elementBy);
        Assert.assertTrue(driver.findElement(elementBy).isDisplayed());
    }
    public void WaitElementToBeClickable(By elementBy){
        waitVisibility(elementBy);
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public void WriteKeys(By elementBy, String text){
        waitVisibility(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }
    public String ParsingElement(By elementBy){
        waitVisibility(elementBy);
        String parsText = driver.findElement(elementBy).getText();
        return parsText;
    }
}
