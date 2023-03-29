package br.com.davi.taskit.tests;

import br.com.davi.taskit.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
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
        String saudacaoAtual = new HomePage(navegador)
                .acessarPaginaDoTaskit()
                .abrirPaginaDeRegistro()
                .registrarNovoUsuario("Wilson Alvess", "wilsin11111","1234")
                .pegarASaudacao();

        Assertions.assertEquals("Hi, Wilson Alvess", saudacaoAtual);
    }

    @AfterEach
    public void tearDown(){
        navegador.quit();
    }
}
