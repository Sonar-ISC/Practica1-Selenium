import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class loginTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        String pathDriver = "/usr/bin/chromedriver/chromedriver";
        System.setProperty("webdriver.chrome.driver",pathDriver);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

        WebElement usuario = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input"));

        usuario.sendKeys("standard_user");

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input"));

        password.sendKeys("secret_sauce");

        Thread.sleep(1000);

        WebElement boton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));

        boton.click();

        Thread.sleep(10000);

    }

    @Test
    public void testUtpLogin() throws InterruptedException {

        driver.get("https://app4.utp.edu.co/pe/");

        WebElement usuario = driver.findElement(By.xpath("//*[@id=\"txtUrio\"]"));

        usuario.sendKeys("1016912325");

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPsswd\"]"));

        password.sendKeys("password");

        Thread.sleep(2000);

        WebElement boton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/form/div[6]/button[1]/span[2]"));

        boton.click();

        Thread.sleep(10000);

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
