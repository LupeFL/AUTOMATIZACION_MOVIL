package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginDetailsScreen extends PageObject {


    //LOGIN
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement typeUsername;
    public void typeUsername(String sUser){
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        typeUsername.click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        typeUsername.sendKeys(sUser);
    }

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement typePassword;
    public void typePassword(String sPassword){
        typePassword.click();
        typePassword.sendKeys(sPassword);
    }

    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement clickLogin;
    public void clickLogin(){
        clickLogin.click();
    }


    //VALIDACION

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement findText;
    public String getResultText(){
        System.out.println("Se comprueba logeo exitoso");
        return findText.getText();
    }

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
    private WebElement findItem;
    public void getItem(){
        System.out.println("Se valida Item");
        if (findItem.isDisplayed()){
            System.out.println("Hay por lo menos un producto en la pagina principal");
        }
        else {
            System.out.println("No se encontraron producto en la pagina principal");
        }
    }


}
