import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MtsTests {

    private static WebDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        cookieButton.click();
    }


    @AfterEach
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void blockNameCheck(){
        String title = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2")).getText();
        assertEquals("ОНЛАЙН ПОПОЛНЕНИЕ\n" + "БЕЗ КОМИССИИ", title);
    }


    @Test
    public void logoCheck(){
        WebElement pays = driver.findElement(By.xpath("//div[@class='pay__partners']"));
        assertTrue(pays.isDisplayed());
    }


    @Test
    public void moreLinkTest(){
        WebElement moreLink = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        moreLink.click();

        WebElement name = driver.findElement(By.xpath("//div[@class='container-fluid']/h3[1]"));
        assertTrue(name.isDisplayed());
    }


    @Test
    public void balancePaymentFieldTest() throws InterruptedException {

        WebElement inputPhone = driver.findElement(By.id("connection-phone"));
        inputPhone.sendKeys("297777777");

        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        inputSum.sendKeys("1");

        WebElement buttonSubmit = driver.findElement(By.xpath(
                "//form[@id='pay-connection']/button[@class='button button__default ']"));
        buttonSubmit.click();

        Thread.sleep(10000);
        driver.switchTo().frame(1);

        WebElement windowPayment = driver.findElement(By.xpath("//div[@class='pay-description__cost']"));
        assertTrue(windowPayment.isDisplayed());

    }
}
