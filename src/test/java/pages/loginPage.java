package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage{
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }


    //LOGIN
    By userLogin = By.xpath("//*[@id='username']");
    By userPass = By.xpath("//*[@id=\"password\"]");
    By userSesion = By.xpath("//*[@id=\"kc-login\"]");
    By btnCreacionPlanes = By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div[4]/div/div/div/div/a/div");







    public void setUserLogin(String texto){
        driver.findElement(userLogin).sendKeys(texto);
    }

    public void setUserPass(String texto){
        driver.findElement(userPass).sendKeys(texto);
    }
    public void setUserSesion(){
        driver.findElement(userSesion).click();
    }
    public void setBtnCreacionPlanes(){
        driver.findElement(btnCreacionPlanes).click();
    }

}
