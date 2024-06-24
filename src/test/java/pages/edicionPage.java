package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class edicionPage {

    WebDriver driver;

    public edicionPage(WebDriver driver) {
        this.driver = driver;
    }

    By btnCreacionPlanes = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div[4]/div/div/div/div");

    public void setBtnCreacionPlanes(){
        driver.findElement(btnCreacionPlanes).click();
    }
}
