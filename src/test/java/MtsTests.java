import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.*;


public class MtsTests {

    private static WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        mainPage = new MainPage(driver);

        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        cookieButton.click();
    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void blockNameTest() {
        String title = mainPage.blockName();
        String cleanedTitle = title.replace("\n", " ").replaceAll("\\s+", " ")
                .trim()
                .toLowerCase();
        assertEquals("онлайн пополнение без комиссии", cleanedTitle);
    }


    @Test
    public void logoTest() {
        assertTrue(mainPage.logoPayment());
    }


    @Test
    public void moreLinkTest() {
        mainPage.moreLink();
        assertTrue(driver.getCurrentUrl().contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"));
    }


    @Test
    public void balancePaymentFieldTest() {

        mainPage.enterPhoneNumber("297777777")
                .enterSumPayment("1")
                .submitButtonClick();

        mainPage.switchToPaymentFrame();

        assertAll(
                () -> assertEquals("1.00 BYN", mainPage.sumPayment(), "Сумма пополнения не совпадает"),
                () -> assertEquals("Оплатить 1.00 BYN", mainPage.paymentButton(),
                        "Текст на кнопке оплаты не совпадает"),
                () -> assertEquals("Оплата: Услуги связи Номер:375297777777", mainPage.payDescription(),
                        "Описание платежа не совпадает")
        );

        String[][] options = {
                {"Номер карты", "creditCard"},
                {"Срок действия", "expirationDate", },
                {"CVC", "cvc"},
                {"Имя и фамилия на карте", "holder"}
        };

        for (String[] option : options) {
            assertEquals(option[0], mainPage.getLabelByFormControlName(option[1]));
        }


    }

    @Test
    public void paymentOptionsCheck() {
        String[][] options = {
                {"Услуги связи",
                        "Номер телефона", "connection-phone",
                        "Сумма", "connection-sum",
                        "E-mail для отправки чека", "connection-email"},
                {"Домашний интернет",
                        "Номер абонента", "internet-phone",
                        "Сумма", "internet-sum",
                        "E-mail для отправки чека", "internet-email"},
                {"Рассрочка",
                        "Номер счета на 44", "score-instalment",
                        "Сумма", "instalment-sum",
                        "E-mail для отправки чека", "instalment-email"},
                {"Задолженность",
                        "Номер счета на 2073", "score-arrears",
                        "Сумма", "arrears-sum",
                        "E-mail для отправки чека", "arrears-email"}
        };

        for (String[] option : options) {
            mainPage.selectPaymentOption(option[0]);
            assertEquals(option[1], mainPage.getPlaceholder(option[2]));
            assertEquals(option[3], mainPage.getPlaceholder(option[4]));
            assertEquals(option[5], mainPage.getPlaceholder(option[6]));
        }

    }
}
