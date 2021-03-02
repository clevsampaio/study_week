package br.com.dbserver.automacao_web.steps;

import br.com.dbserver.automacao_web.pageobjects.BuyProductPageObject;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BuyProductStep {
    private final BuyProductPageObject object;
    private final Faker faker;

    public BuyProductStep(WebDriver driver) {
        object = new BuyProductPageObject(driver);
        faker = new Faker();
    }

    public BuyProductStep pesquisarProduto(String produto) {
        object.searchTextField().sendKeys(produto);
        object.submitSearchButton().click();
        object.firstResultProductButton().click();
        return this;
    }

    public BuyProductStep adicionarProdutoAoCarrinho() {
        Assert.assertEquals(object.productPriceLabel().getText(), "$27.00");
        object.addToCartButton().click();
        return this;
    }

    public BuyProductStep resumoDaCompra() {
        object.layerToCartButton().click();
        Assert.assertEquals(object.totalPriceLabel().getText(), "$29.00");
        object.proceedToCheckoutButton().click();
        return this;
    }

    public BuyProductStep realizarCadastro() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        object.createAnAccountTextField().sendKeys(faker.internet().safeEmailAddress());
        object.createAnAccountButton().click();
        object.genderCheckBox().click();
        object.customerFirstNameTextField().sendKeys(firstName);
        object.customerLastNameTextField().sendKeys(lastName);
        object.passwordTextField().sendKeys(faker.internet().password());
        object.firstNameTextField().sendKeys(firstName);
        object.lastNameTextField().sendKeys(lastName);
        object.addressTextField().sendKeys(faker.address().streetAddress());
        object.cityTextField().sendKeys(faker.address().city());
        object.stateComboBox().selectByIndex(6);
        object.postalCodeTextField().sendKeys(faker.number().digits(5));
        object.phoneMobileTextField().sendKeys(faker.phoneNumber().cellPhone());
        object.registerButton().click();
        return this;
    }

    public BuyProductStep confirmarEndereco() {
        object.processAddressButton().click();
        return this;
    }

    public BuyProductStep definirRemessa() {
        object.termsOfServiceCheckBox().click();
        object.processCarrierButton().click();
        return this;
    }

    public BuyProductStep realizarPagamento() {
        object.payByBankWireButton().click();
        object.iConfirmMyOrderButton().click();
        Assert.assertEquals(object.orderConfirmationLabel().getText(), "Your order on My Store is complete.");
        return this;
    }

    public BuyProductStep desconectar() {
        object.signOutButton().click();
        Assert.assertEquals(object.authenticationLabel().getText(), "AUTHENTICATION");
        return this;
    }
}