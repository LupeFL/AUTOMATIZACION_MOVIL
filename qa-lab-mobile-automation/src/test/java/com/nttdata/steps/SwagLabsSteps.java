package com.nttdata.steps;

import com.nttdata.screens.LoginDetailsScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabsSteps {

    LoginDetailsScreen loginDetailsScreen;


    //LOGIN
    @Step("Ingresar usuario")
    public void typeUser(String user){
        loginDetailsScreen.typeUsername(user);
    }

    @Step("Ingresar clave")
    public void typeClave(String sClave){
        loginDetailsScreen.typePassword(sClave);
    }

    @Step("Click en login")
    public void clickIngresar(){
        loginDetailsScreen.clickLogin();
    }


    //VALIDACION
    @Step("Obtiene el texto Products en la pagina principal")
    public String getResultText(){
        return loginDetailsScreen.getResultText();

    }

    @Step("Obtiene item en la pagina principal")
    public void getResultItem(){
        loginDetailsScreen.getItem();
    }
}
