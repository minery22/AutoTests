package Test.Conversion;

import Test.BaseConfiguration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConversionTest extends BaseConfiguration {

    @BeforeMethod
    public void InitialFillingLogin(){
        main.GoTo();
        conversionBase  .CheckAllElementsPage();
    }
    //temperatureCityMoscow Eight day
    @Test
    public void ConTemperatureCityMoscowEightday(){
        conversionBase  .InsertSearchSity("Moscow")
                .InvisibilityOwmLoader()
                .ElementCityButtonClick()
                .ClickSearchSityButtonClick()
                .ElementChoiceCity("Moscow, RU ")
                .ClickСhoiсeSityClick("Moscow, RU ")
                .ElementSwitchLeftMetric()
                .InvisibilityOwmLoader()
                .ElementLMToBeClickable()
                .ClickSwitchLeftMetric()
                .CheckAllWebElementTempDayC()
                .ParsingWebElementTempDayOneC()
                .ParsingWebElementTempDayTwoC()
                .ParsingWebElementTempDayThreeC()
                .ParsingWebElementTempDayFourC()
                .ParsingWebElementTempDayFiveC()
                .ParsingWebElementTempDaySixC()
                .ParsingWebElementTempDaySevenC()
                .ParsingWebElementTempDayEightC()
                .ElementSwitchRightMetric()
                .InvisibilityOwmLoader()
                .ElementRMToBeClickable()
                .ClickSwitchRightMetric()
                .CheckAllWebElementTempDayF()
                .ParsingWebElementTempDayOneF()
                .ParsingWebElementTempDayTwoF()
                .ParsingWebElementTempDayThreeF()
                .ParsingWebElementTempDayFourF()
                .ParsingWebElementTempDayFiveF()
                .ParsingWebElementTempDaySixF()
                .ParsingWebElementTempDaySevenF()
                .ParsingWebElementTempDayEightF()
                .CorrectConversionMetric();
    }
    @Test
    public void ConTemperatureCityYOEightday(){
        conversionBase  .InsertSearchSity("Yoshkar-Ola")
                .InvisibilityOwmLoader()
                .ElementCityButtonClick()
                .ClickSearchSityButtonClick()
                .ElementChoiceCity("Yoshkar-Ola, RU ")
                .ClickСhoiсeSityClick("Yoshkar-Ola, RU ")
                .ElementSwitchLeftMetric()
                .InvisibilityOwmLoader()
                .ElementLMToBeClickable()
                .ClickSwitchLeftMetric()
                .CheckAllWebElementTempDayC()
                .ParsingWebElementTempDayOneC()
                .ParsingWebElementTempDayTwoC()
                .ParsingWebElementTempDayThreeC()
                .ParsingWebElementTempDayFourC()
                .ParsingWebElementTempDayFiveC()
                .ParsingWebElementTempDaySixC()
                .ParsingWebElementTempDaySevenC()
                .ParsingWebElementTempDayEightC()
                .ElementSwitchRightMetric()
                .InvisibilityOwmLoader()
                .ElementRMToBeClickable()
                .ClickSwitchRightMetric()
                .CheckAllWebElementTempDayF()
                .ParsingWebElementTempDayOneF()
                .ParsingWebElementTempDayTwoF()
                .ParsingWebElementTempDayThreeF()
                .ParsingWebElementTempDayFourF()
                .ParsingWebElementTempDayFiveF()
                .ParsingWebElementTempDaySixF()
                .ParsingWebElementTempDaySevenF()
                .ParsingWebElementTempDayEightF()
                .CorrectConversionMetric();
    }
    //temperatureCityLondon Eight day
    @Test
    public void ConTemperatureCityLondonEightday(){
        conversionBase  .InsertSearchSity("London")
                .InvisibilityOwmLoader()
                .ElementCityButtonClick()
                .ClickSearchSityButtonClick()
                .ElementChoiceCity("London, GB ")
                .ClickСhoiсeSityClick("London, GB ")
                .ElementSwitchLeftMetric()
                .InvisibilityOwmLoader()
                .ElementLMToBeClickable()
                .ClickSwitchLeftMetric()
                .CheckAllWebElementTempDayC()
                .ParsingWebElementTempDayOneC()
                .ParsingWebElementTempDayTwoC()
                .ParsingWebElementTempDayThreeC()
                .ParsingWebElementTempDayFourC()
                .ParsingWebElementTempDayFiveC()
                .ParsingWebElementTempDaySixC()
                .ParsingWebElementTempDaySevenC()
                .ParsingWebElementTempDayEightC()
                .ElementSwitchRightMetric()
                .InvisibilityOwmLoader()
                .ElementRMToBeClickable()
                .ClickSwitchRightMetric()
                .CheckAllWebElementTempDayF()
                .ParsingWebElementTempDayOneF()
                .ParsingWebElementTempDayTwoF()
                .ParsingWebElementTempDayThreeF()
                .ParsingWebElementTempDayFourF()
                .ParsingWebElementTempDayFiveF()
                .ParsingWebElementTempDaySixF()
                .ParsingWebElementTempDaySevenF()
                .ParsingWebElementTempDayEightF()
                .CorrectConversionMetric();
    }

    @Test
    public void ConTemperatureCurrentCityMoscow(){
        conversionBase  .InsertSearchSity("Moscow")
                .InvisibilityOwmLoader()
                .ElementCityButtonClick()
                .ClickSearchSityButtonClick()
                .ElementChoiceCity("Moscow, RU ")
                .ClickСhoiсeSityClick("Moscow, RU ")
                .ElementSwitchLeftMetric()
                .InvisibilityOwmLoader()
                .ElementLMToBeClickable()
                .ClickSwitchLeftMetric()
                .ElementParsingWebElementTempC()
                .ParsingWebElementTempC()
                .ElementSwitchRightMetric()
                .InvisibilityOwmLoader()
                .ElementRMToBeClickable()
                .ClickSwitchRightMetric()
                .ElementParsingWebElementTempF()
                .ParsingWebElementTempF()
                .CorrectConversionMetric();
    }

    @Test
    public void ConTemperatureCurrentCityLondon(){
        conversionBase  .InsertSearchSity("Yoshkar-Ola, RU")
                .InvisibilityOwmLoader()
                .ElementCityButtonClick()
                .ClickSearchSityButtonClick()
                .ElementChoiceCity("Yoshkar-Ola, RU ")
                .ClickСhoiсeSityClick("Yoshkar-Ola, RU ")
                .ElementSwitchLeftMetric()
                .InvisibilityOwmLoader()
                .ElementLMToBeClickable()
                .ClickSwitchLeftMetric()
                .ElementParsingWebElementTempC()
                .ParsingWebElementTempC()
                .ElementSwitchRightMetric()
                .InvisibilityOwmLoader()
                .ElementRMToBeClickable()
                .ClickSwitchRightMetric()
                .ElementParsingWebElementTempF()
                .ParsingWebElementTempF()
                .CorrectConversionMetric();
    }

    @Test
    public void ConTemperatureCurrentCityYO(){
        conversionBase  .InsertSearchSity("London")
                .InvisibilityOwmLoader()
                .ElementCityButtonClick()
                .ClickSearchSityButtonClick()
                .ElementChoiceCity("London, GB ")
                .ClickСhoiсeSityClick("London, GB ")
                .ElementSwitchLeftMetric()
                .InvisibilityOwmLoader()
                .ElementLMToBeClickable()
                .ClickSwitchLeftMetric()
                .ElementParsingWebElementTempC()
                .ParsingWebElementTempC()
                .ElementSwitchRightMetric()
                .InvisibilityOwmLoader()
                .ElementRMToBeClickable()
                .ClickSwitchRightMetric()
                .ElementParsingWebElementTempF()
                .ParsingWebElementTempF()
                .CorrectConversionMetric();
    }

    @AfterMethod
    public void Coocienew()
    {
        main.CookiesDelete();
    }
}
