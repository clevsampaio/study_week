package br.com.dbserver.automacao_web.pageobjects;

import br.com.dbserver.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BuyProductPageObject {
    private final WaitElement wait;
    private final WebDriver driver;

    public BuyProductPageObject(WebDriver _driver) {
        wait = new WaitElement(_driver);
        driver = _driver;
    }

    public WebElement searchTextField() {
        return wait.toBeClickable(By.id("search_query_top"));
    }

    public WebElement submitSearchButton() {
        return wait.toBeClickable(By.name("submit_search"));
    }

    public WebElement firstResultProductButton() {
        return wait.toBeClickable(By.xpath("//div[@id='center_column']/ul/li/div/div[2]/h5/a"));
    }

    public WebElement productPriceLabel() {
        return wait.visibilityOf(By.id("our_price_display"));
    }

    public WebElement addToCartButton() {
        return wait.toBeClickable(By.id("add_to_cart"));
    }

    public WebElement layerToCartButton() {
        return wait.toBeClickable(By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
    }

    public WebElement totalPriceLabel() {
        return wait.visibilityOf(By.id("total_price"));
    }

    public WebElement proceedToCheckoutButton() {
        return wait.toBeClickable(By.xpath("//div[@id='center_column']/p[2]/a[1]"));
    }

    public WebElement createAnAccountTextField() {
        return wait.toBeClickable(By.id("email_create"));
    }

    public WebElement createAnAccountButton() {
        return wait.toBeClickable(By.id("SubmitCreate"));
    }

    public WebElement genderCheckBox() {
        return wait.toBeClickable(By.id("uniform-id_gender1"));
    }

    public WebElement customerFirstNameTextField() {
        return wait.toBeClickable(By.id("customer_firstname"));
    }

    public WebElement customerLastNameTextField() {
        return wait.toBeClickable(By.id("customer_lastname"));
    }

    public WebElement passwordTextField() {
        return wait.toBeClickable(By.id("passwd"));
    }

    public WebElement firstNameTextField() {
        return wait.toBeClickable(By.id("firstname"));
    }

    public WebElement lastNameTextField() {
        return wait.toBeClickable(By.id("lastname"));
    }

    public WebElement addressTextField() {
        return wait.toBeClickable(By.id("address1"));
    }

    public WebElement cityTextField() {
        return wait.toBeClickable(By.id("city"));
    }

    public Select stateComboBox() {
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement postalCodeTextField() {
        return wait.toBeClickable(By.id("postcode"));
    }

    public WebElement phoneMobileTextField() {
        return wait.toBeClickable(By.id("phone_mobile"));
    }

    public WebElement registerButton() {
        return wait.toBeClickable(By.id("submitAccount"));
    }

    public WebElement processAddressButton() {
        return wait.toBeClickable(By.name("processAddress"));
    }

    public WebElement termsOfServiceCheckBox() {
        return wait.toBeClickable(By.id("uniform-cgv"));
    }

    public WebElement processCarrierButton() {
        return wait.toBeClickable(By.name("processCarrier"));
    }

    public WebElement payByBankWireButton() {
        return wait.toBeClickable(By.xpath("//div[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
    }

    public WebElement iConfirmMyOrderButton() {
        return wait.toBeClickable(By.xpath("//p[@id='cart_navigation']/button"));
    }

    public WebElement orderConfirmationLabel() {
        return wait.visibilityOf(By.xpath("//div[@id='center_column']/div/p/strong"));
    }

    public WebElement signOutButton() {
        return wait.toBeClickable(By.xpath("//header[@id='header']/div[2]/div/div/nav/div[2]/a"));
    }

    public WebElement authenticationLabel() {
        return wait.visibilityOf(By.xpath("//div[@id='center_column']/h1"));
    }
}