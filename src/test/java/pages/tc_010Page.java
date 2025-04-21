package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By uploadInput = By.id("uploadInput");
    By documentList = By.id("documentList");
    By loginButton = By.id("loginButton");
    By logoutButton = By.id("logoutButton");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://application-url/documents");
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public boolean isDocumentListed(String documentName) {
        return driver.findElement(documentList).getText().contains(documentName);
    }

    public void logoutAndRestart() {
        driver.findElement(logoutButton).click();
        // Restart application logic here if needed
    }

    public void login() {
        driver.findElement(loginButton).click();
    }
}