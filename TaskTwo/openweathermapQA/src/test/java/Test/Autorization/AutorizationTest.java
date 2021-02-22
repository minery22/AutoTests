package Test.Autorization;

import Test.BaseConfiguration;
import org.testng.annotations.*;


public class AutorizationTest extends BaseConfiguration {

    @BeforeMethod
    public void InitialFillingLogin(){
        main.GoTo();
        authorizationBase.CheckSignElementPage()
                        .ClickSign()
                        .CheckAllElementonPage()
                        .fillinLogin("minery1@yandex.ru")
                        .fillinPassword("12pasTestnewG");
    }
    //без кнопки remember me
    @Test
    public void loginCorrectAutorization()
    {
        authorizationBase.ButtonLoginClick()
                        .LoginCorrect();
    }
    // по нажатию текста remember me
    @Test
    public void AutorizationRememberMe()
    {
        authorizationBase.CheckBoxClickName()
                        .ButtonLoginClick()
                        .LoginCorrect();
    }
    @Test
    public void AutorizationRememberClickCB()
    {
        authorizationBase.CheckBoxClickWindow()
                        .ButtonLoginClick()
                        .LoginCorrect();
    }
    @AfterMethod
    public void Coocienew()
    {
        main.CookiesDelete();
    }
}
