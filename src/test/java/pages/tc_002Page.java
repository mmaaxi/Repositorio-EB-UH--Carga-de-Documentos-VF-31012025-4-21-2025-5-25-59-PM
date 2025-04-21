package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;
    By uploadInput = By.id("uploadInput");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}