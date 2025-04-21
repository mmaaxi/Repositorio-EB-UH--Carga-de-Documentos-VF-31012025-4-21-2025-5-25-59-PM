package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_003Page {

    WebDriver driver;

    By uploadInput = By.id("upload-input");
    By errorMessage = By.id("error-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectOversizedFile() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("/path/to/oversized/file");
    }

    public void uploadFile() {
        driver.findElement(By.id("upload-button")).click();
    }

    public boolean isFileRejected() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}