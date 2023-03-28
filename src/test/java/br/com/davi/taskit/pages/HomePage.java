package br.com.davi.taskit.pages;

import br.com.davi.taskit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By localizadorDoBotaoSignUp = By.id("signup");

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public void acessarPaginaDoTaskit() {
        navegador.get("http://www.juliodelima.com.br/taskit/");
    }

    public void abrirPaginaDeRegistro () {
        navegador.findElement(localizadorDoBotaoSignUp).click();
    }
}
