package br.com.davi.taskit.pages;

import br.com.davi.taskit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecretaPage extends BasePage {

    private By localizadorDaSaudacao = By.className("me");

    public SecretaPage(WebDriver navegador) {
        super(navegador);
    }

    public String pegarASaudacao() {
        return navegador.findElement(localizadorDaSaudacao).getText();
    }
}
