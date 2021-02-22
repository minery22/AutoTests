package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AuthorizationBase extends BaseMetods{
    public AuthorizationBase(WebDriver driver) {
        super(driver);
    }

    public AuthorizationBase CheckSignElementPage()
    {
        ElementDisplayed(By.xpath("//li[@class='user-sign-in']"));
        return this;
    }

    public AuthorizationBase ClickSign(){
        click(By.xpath("//li[@class='user-sign-in']"));
        return this;
    }

    public AuthorizationBase CheckAllElementonPage(){
        ElementDisplayed(By.xpath("//div[@class='sign-form']"));
        ElementDisplayed(By.xpath("//div[@class='input-group']/*[@id='user_email']"));
        ElementDisplayed(By.xpath("//div[@class='input-group']/*[@id='user_password']"));
        ElementDisplayed(By.xpath("//input[@type='submit'][@value='Submit']"));
        return this;
    }

    public AuthorizationBase fillinLogin(String login){
        WriteKeys(By.xpath("//div[@class='input-group']/*[@id='user_email']"), login);
        return this;
    }

    public AuthorizationBase fillinPassword(String password){
        WriteKeys(By.xpath("//div[@class='input-group']/*[@id='user_password']"), password);
        return this;
    }

    public AuthorizationBase CheckBoxClickName(){
        click(By.xpath("//div[@class='checkbox']/*[@for = 'user_remember_me']"));
        return this;
    }

    public AuthorizationBase CheckBoxClickWindow(){
        click(By.xpath("//div[@class='checkbox']/*[@for = 'user_remember_me']/*[@type='checkbox']"));
        return this;
    }

    public AuthorizationBase ButtonLoginClick(){
        click(By.xpath("//input[@type='submit'][@value='Submit']"));
        return this;
    }

    public AuthorizationBase LoginCorrect(){
        ElementDisplayed(By.xpath("//div[@class='panel-body'][contains(text(),'Signed in successfully.')]"));
        return this;
    }

    public AuthorizationBase LoginIsNotCorrect(){
        ElementDisplayed(By.xpath("//div[@class='panel-body'][contains(text(),'Invalid Email or password.')]"));
        return this;
    }


}
