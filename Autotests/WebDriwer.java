package MyShop;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import java.io.*;
import java.util.Properties;

public class WebDriwer {
    public WebDriver driver;
    public String name;
    @Before
    public void read() throws IOException {
            System.setProperty("webdriver.chrome.driver", "D:\\JAVA_idea\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            //chetenie
            FileReader fr1 = new FileReader("D:\\JAVA_idea\\read.properties");
            Properties pr = new Properties();
            pr.load(fr1);
            name = pr.getProperty("name");
    }

    @After
    public void write() throws IOException {
        //zapis
        WebElement SummaPokupki = driver.findElement(By.xpath("//div[@class='cart-info-pane__itogo__v']"));
        String text_t = "Общая цена покупки " + SummaPokupki.getText();
        System.out.println(text_t);
        FileWriter fr = new FileWriter("D:\\JAVA_idea\\write.properties", true);
        Properties p = new Properties();
        p.setProperty("test", text_t);
        p.store(fr, "Sample comments");
    }


}
