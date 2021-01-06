//https://www.youtube.com/watch?v=r1lmy2WhnHs
package MyShop;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class chst2 extends WebDriwer {
    @Test
    public void chst2() throws InterruptedException {
        //<zagruzka>
        driver.get("https://my-shop.ru/"); WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Войти\"]/parent::a")));
        //</zagruzka>
        //<voity>
        WebElement header = driver.findElement(By.xpath("//div[@class='header']"));
        header.findElement(By.xpath("//span[text()=\"Войти\"]/parent::a")).click();
        //</voity>
        //<forma zapolnen>
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='auth__content']")));
        driver.findElement(By.xpath("//div[@class='auth__content']//input[@type='text']")).sendKeys("s6844590@gmail.com");
        driver.findElement(By.xpath("//div[@class='auth__content']//input[@type='password']")).sendKeys("xDy2R2");
        driver.findElement(By.xpath("//button[@class='form__btn--action']")).click();
        //</forma zapolnen>
        //<poisk tovara>
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header__body']")));
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//div[@class='header__body']//input[@type='text']")).sendKeys(name);
        driver.findElement(By.xpath("//span[text()=\"Искать\"]/parent::button")).click();
        TimeUnit.SECONDS.sleep(2);
        //</poisk tovara>
        //<filtr>
        driver.findElement(By.xpath("//span[text()=\"В акциях\"]/parent::div")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//div[@class='btn btn-select btn-sort']")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//span[text()=\"рейтингу\"]/parent::div")).click();
        TimeUnit.SECONDS.sleep(2);
        //</filtr>
        //<dobav korzina>
        driver.findElement(By.xpath("//span[text()='Ложка-загребушка с монетами']//parent::a")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//div[@class='rounded-pane rounded-pane1 rounded1-grid']//button[@class='btn btn-buy']")).click();
        TimeUnit.SECONDS.sleep(2);
        //<//dobav korzina>
        //<perehod korzina>
        driver.findElement(By.xpath("//span[text()=\"Корзина\"]/parent::a")).click();
        TimeUnit.SECONDS.sleep(2);
        //</perehod korzina>
        //<plus>
        driver.findElement(By.xpath("//div[@class='item-pane__middle not-visible-on-desktop']//button[@class='btn-plus btn-plusr']")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//div[@class='item-pane__middle not-visible-on-desktop']//button[@class='btn-plus btn-plusr']")).click();
        TimeUnit.SECONDS.sleep(2);
        //<plus>
    }

}
