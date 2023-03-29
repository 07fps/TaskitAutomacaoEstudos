package br.com.davi.taskit.tests;

import br.com.davi.taskit.pages.HomePage;
import br.com.davi.taskit.pages.RegistroPage;
import br.com.davi.taskit.pages.SecretaPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

@DisplayName("Testes de novo usuário!")
public class LoginTests {

    private WebDriver navegador;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        navegador = new ChromeDriver(options);
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Registrar um novo usuário")
    public void testRegistrarUmNovoUsuarioValido() {

        HomePage homePage = new HomePage(navegador);
        homePage.acessarPaginaDoTaskit();
        homePage.abrirPaginaDeRegistro();

        RegistroPage registroPage = new RegistroPage(navegador);
        registroPage.registrarNovoUsuario("Davi Ricardo","davir", "123456");

        SecretaPage secretapage = new SecretaPage(navegador);
        String saudacaoAtual = secretapage.pegarASaudacao();
        Assertions.assertEquals("Hi, Davi Ricardo", saudacaoAtual);
    }

    @AfterEach
    public void tearDown(){
        navegador.quit();
    }
}
