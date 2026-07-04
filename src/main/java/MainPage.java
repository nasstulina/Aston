import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        super(driver);
    }

    public String blockName(){
        return driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2")).getText();
    }

    public boolean logoPayment() {
        return driver.findElement(By.xpath("//div[@class='pay__partners']")).isDisplayed();
    }

    public void moreLink(){
        driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']")).click();
    }

    public MainPage enterPhoneNumber(String phone){
        driver.findElement(By.id("connection-phone")).sendKeys(phone);
        return this;
    }

    public MainPage enterSumPayment(String sum){
        driver.findElement(By.id("connection-sum")).sendKeys(sum);
        return this;
    }

    public void submitButtonClick(){
        driver.findElement(By.xpath(
                "//form[@id='pay-connection']/button[@class='button button__default ']")).click();
    }

    public MainPage switchToPaymentFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay-description__cost']")));
        return this;
    }

    public String sumPayment(){
        return driver.findElement(By.xpath("//div[@class='pay-description__cost']")).getText();
    }

    public String paymentButton(){
        return driver.findElement(By.xpath("//button[@class='colored disabled']")).getText().trim();
    }

    public String payDescription(){
        return driver.findElement(By.xpath("//div[@class='pay-description__text']")).getText();
    }

    public String getLabelByFormControlName(String formControlName) {
        return driver.findElement(
                By.xpath("//input[@formcontrolname='" + formControlName + "']/following-sibling::label")
        ).getText();
    }

    public MainPage selectPaymentOption(String optionText){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='select__header']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/p[text()='" + optionText + "']"))).click();
        return this;
    }

    public String getPlaceholder(String elementId){
        return driver.findElement(By.id(elementId)).getAttribute("placeholder");
    }
}

