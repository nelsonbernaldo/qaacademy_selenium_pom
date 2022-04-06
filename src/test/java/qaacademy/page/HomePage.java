package qaacademy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    

    String REGISTRAR = "//a[@id='btnRegister']"; 
    String EMAIL = "//input[@id='inputEmail']";
    String NOME = "//input[@id='inputName']";
    String SENHA = "//input[@id='inputPassword']";
    String CONFIRM_SENHA = "//input[@id='inputPasswordConfirmation']";
    String CRIAR_SALDO = "//span[@id='toggleAddBalance']";
    String CADASTRAR = "//a[@id='btnRegister']";

    public  HomePage(WebDriver driverLocalVindoDoTeste){
        this.driver = driverLocalVindoDoTeste;

        
    }

public void clicarRegistrar(){
    driver.findElement(By.xpath(REGISTRAR)).click();
}

public void preencherEmail(){
    driver.findElement(By.xpath(EMAIL)).sendKeys("Teste@Teste.com.br");
}

public void preencherNome(){
    driver.findElement(By.xpath(NOME)).sendKeys("Nelson");
}

public void preencherSenha(){
    driver.findElement(By.xpath(SENHA)).sendKeys("123456");
} 



public void preencherConfirmacaoSenha(){
    driver.findElement(By.xpath(CONFIRM_SENHA)).sendKeys("123456");

} 


public void clicarEmCriarComSaldo(){
    driver.findElement(By.xpath(CRIAR_SALDO)).click();

} 

public void clicarCadastrar(){
    driver.findElement(By.xpath(CADASTRAR)).click();


} 


    
}
