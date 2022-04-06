package qaacademy.cenarios;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qaacademy.page.HomePage;

public class TesteCadastramento {

WebDriver driver;
HomePage homePage;

@Before
public void inicializacao(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    homePage = new HomePage(driver);
    driver.get("http://localhost:3000");
 

}

@Test
public void testeCadastro(){

    homePage.clicarRegistrar();
    homePage.preencherEmail();
    homePage.preencherNome();
    homePage.preencherSenha();
    homePage.preencherConfirmacaoSenha();
    homePage.clicarEmCriarComSaldo();
    homePage.clicarCadastrar();


}

@After
public void finalizar(){
driver.quit();


}



    
}
