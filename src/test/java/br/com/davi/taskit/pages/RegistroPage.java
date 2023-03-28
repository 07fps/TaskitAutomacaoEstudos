package br.com.davi.taskit.pages;

import br.com.davi.taskit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPage extends BasePage {

    private By localizadorDoCampoNome = By.id("name-sign-up");
    private By localizadorDoCampoLogin = By.id("login-sign-up");
    private By localizadorDoCampoSenha = By.id("password-sign-up");
    private By localizadorDoBotaoSalvar = By.id("btn-submit-sign-up");

    public RegistroPage(WebDriver navegador) {
        super(navegador);
    }

    public void registrarNovoUsuario(String nome, String login, String senha) {
        navegador.findElement(localizadorDoCampoNome).sendKeys(nome);
        navegador.findElement(localizadorDoCampoLogin).sendKeys(login);
        navegador.findElement((localizadorDoCampoSenha)).sendKeys(senha);
        navegador.findElement(localizadorDoBotaoSalvar).click();
    }
}
