package BasePage;

import Logics.Conversion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConversionBase extends BaseMetods{

    Conversion conversion;
    public ConversionBase(WebDriver driver) {
        super(driver);
        conversion = new Conversion();
    }
    public ConversionBase CheckAllElementsPage(){
        ElementDisplayed(By.xpath("//div[@class='search-container']/*[@placeholder='Search city']"));
        ElementDisplayed(By.xpath("//button[@class='button-round dark']"));
        ElementDisplayed(By.xpath("//div[@class='switch']/*[@class='left'][@for='metric']"));
        ElementDisplayed(By.xpath("//div[@class='switch']/*[@class='right'][@for='imperial']"));
        ElementDisplayed(By.xpath("//div/span[@class='heading']"));
        return this;
    }

    public ConversionBase ElementChoiceCity(String CityName){
        ElementDisplayed(By.xpath("(//ul[@class='search-dropdown-menu']/li/span[text()='"+CityName+"'])[1]"));
        return this;
    }

    public ConversionBase InsertSearchSity(String CityName){
        WriteKeys(By.xpath("//div[@class='search-container']/*[@placeholder='Search city']"), CityName);
        return this;
    }

    public ConversionBase InvisibilityOwmLoader(){
        waitIVisibility(By.xpath("//div[@class='owm-loader']"));
        return this;
    }

    public ConversionBase ElementCityButtonClick(){
        ElementDisplayed(By.xpath("//button[@class='button-round dark']"));
        return this;
    }

    public ConversionBase ClickSearchSityButtonClick(){
        click(By.xpath("//button[@class='button-round dark']"));
        return this;
    }

    public ConversionBase ElementSwitchLeftMetric(){
        ElementDisplayed(By.xpath("//div[@class='switch']/*[@class='left'][@for='metric']"));
        return this;
    }

    public ConversionBase ElementLMToBeClickable(){
        WaitElementToBeClickable(By.xpath("//div[@class='switch']/*[@class='left'][@for='metric']"));
        return this;
    }

    public ConversionBase ClickSwitchLeftMetric(){
        click(By.xpath("//div[@class='switch']/*[@class='left'][@for='metric']"));
        return this;
    }

    public ConversionBase ElementSwitchRightMetric(){
        ElementDisplayed(By.xpath("//div[@class='switch']/*[@class='right'][@for='imperial']"));
        return this;
    }

    public ConversionBase ElementRMToBeClickable(){
        WaitElementToBeClickable(By.xpath("//div[@class='switch']/*[@class='right'][@for='imperial']"));
        return this;
    }

    public ConversionBase ClickSwitchRightMetric(){
        click(By.xpath("//div[@class='switch']/*[@class='right'][@for='imperial']"));
        return this;
    }
    public ConversionBase ClickСhoiсeSityClick(String City){
        click(By.xpath("(//ul[@class='search-dropdown-menu']/li/span[text()='"+City+"'])[1]"));
        return this;
    }

    public ConversionBase ElementParsingWebElementTempC(){
        ElementDisplayed(By.xpath("//span[@class='heading'][contains(text(), 'C')]"));
        return this;
    }

    public ConversionBase CheckAllWebElementTempDayC(){
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[1]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[2]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[3]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[4]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[5]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[6]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[7]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[8]/div[@class='day-list-values']/div/span[contains(text(), 'C')]"));
        return this;
    }

    public ConversionBase CheckAllWebElementTempDayF(){
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[1]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[2]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[3]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[4]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[5]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[6]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[7]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        ElementDisplayed(By.xpath("//ul[@class='day-list']/li[8]/div[@class='day-list-values']/div/span[contains(text(), 'F')]"));
        return this;
    }

    public ConversionBase ElementParsingWebElementTempF(){
        ElementDisplayed(By.xpath("//span[@class='heading'][contains(text(), 'F')]"));
        return this;
    }

    public ConversionBase ParsingWebElementTempC(){
        conversion.conversionCF(ParsingElement(By.xpath("//span[@class='heading'][contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayOneC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[1]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayTwoC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[2]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayThreeC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[3]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayFourC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[4]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayFiveC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[5]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDaySixC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[6]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDaySevenC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[7]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayEightC(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[8]/div[@class='day-list-values']/div/span[contains(text(), 'C')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayOneF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[1]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayTwoF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[2]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayThreeF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[3]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayFourF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[4]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayFiveF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[5]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDaySixF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[6]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDaySevenF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[7]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempDayEightF(){
        conversion.conversionCF(ParsingElement(By.xpath("//ul[@class='day-list']/li[8]/div[@class='day-list-values']/div/span[contains(text(), 'F')]")));
        return this;
    }

    public ConversionBase ParsingWebElementTempF(){
        conversion.conversionCF(ParsingElement(By.xpath("//span[@class='heading'][contains(text(), 'F')]")));
        return this;
    }
    public ConversionBase CorrectConversionMetric(){
        Assert.assertTrue(conversion.СorrectСonversion());
        return this;
    }
}
