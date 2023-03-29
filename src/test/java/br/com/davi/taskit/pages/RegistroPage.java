package br.com.davi.taskit.pages;

import br.com.davi.taskit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistroPage extends BasePage {

    @FindBy(id = "name-sign-up")
    private WebElement campoNome;

    @FindBy(id = "login-sign-up")
    private WebElement campoLogin;

    @FindBy(id = "password-sign-up")
    private WebElement campoSenha;

    @FindBy(id = "btn-submit-sign-up")
    private WebElement botaoSalvar;

    public RegistroPage(WebDriver navegador) {
        super(navegador);
    }

    public void registrarNovoUsuario(String nome, String login, String senha) {
        campoNome.sendKeys(nome);
        campoLogin.sendKeys(login);
        campoSenha.sendKeys(senha);
        botaoSalvar.click();
    }
}
