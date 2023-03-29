package br.com.davi.taskit.pages;

import br.com.davi.taskit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "signup")
    private WebElement botaoSignUp;

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public void acessarPaginaDoTaskit() {
        navegador.get("http://www.juliodelima.com.br/taskit/");
    }

    public void abrirPaginaDeRegistro () {
        botaoSignUp.click();
    }
}
