package Test.Autorization;

import Test.BaseConfiguration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutorizationFailsTest extends BaseConfiguration {

    @BeforeMethod
    public void InitialFillingLogin(){
        main.GoTo();
        authorizationBase.CheckSignElementPage()
                        .ClickSign()
                        .CheckAllElementonPage();
    }
    //без логина (checkbox не нажат)
    @Test
    public void WithoutLoginAuth()
    {
        authorizationBase.fillinPassword("12pasTestnewG")
                        .ButtonLoginClick()
                        .LoginIsNotCorrect();
    }
    //без пароля (checkbox не нажат)
    @Test
    public void WithoutPassAuth()
    {
        authorizationBase.fillinLogin("minery1@yandex.ru")
                        .ButtonLoginClick()
                        .LoginIsNotCorrect();
    }
    // без логина и пароля (checkbox не нажат)
    @Test
    public void WithoutPassLoginAuth()
    {
        authorizationBase.ButtonLoginClick()
                        .LoginIsNotCorrect();
    }
    // без пароля с нажатым checkbox(окно)
    @Test
    public void WithoutPassAuthWithWindows()
    {
        authorizationBase.fillinLogin("minery1@yandex.ru")
                        .ButtonLoginClick()
                        .CheckBoxClickWindow()
                        .LoginIsNotCorrect();
    }
    // без логина с нажатым checkbox(текст)
    @Test
    public void WithoutLoginAuthWithText()
    {
        authorizationBase.fillinLogin("minery1@yandex.ru")
                        .ButtonLoginClick()
                        .CheckBoxClickName()
                        .LoginIsNotCorrect();
    }
    // без логина с нажатым checkbox(окно)
    @Test
    public void WithoutLoginAuthWithWindows()
    {
        authorizationBase.fillinPassword("12pasTestnewG")
                        .CheckBoxClickWindow()
                        .ButtonLoginClick()
                        .LoginIsNotCorrect();
    }
    // без пароля с нажатым checkbox(текст)
    @Test
    public void WithoutPassAuthWithText()
    {
        authorizationBase.fillinPassword("12pasTestnewG")
                        .CheckBoxClickName()
                        .ButtonLoginClick()
                        .LoginIsNotCorrect();
    }
    // без логина и пароля с нажатым checkbox(окно)
    @Test
    public void WithoutPassLoginAuthСHW()
    {
        authorizationBase.CheckBoxClickWindow()
                        .ButtonLoginClick()
                        .LoginIsNotCorrect();
    }
    // без логина и пароля с нажатым checkbox(текст)
    @Test
    public void WithoutPassLoginAuthСHT()
    {
        authorizationBase.CheckBoxClickName()
                        .ButtonLoginClick()
                        .LoginIsNotCorrect();
    }
    @AfterMethod
    public void Coocienew()
    {
        main.CookiesDelete();
    }
}
