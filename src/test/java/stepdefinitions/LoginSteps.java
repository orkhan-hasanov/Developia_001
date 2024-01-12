package stepdefinitions;

import Pom.LoginPom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps extends BaseMethods{

    LoginPom loginPom;

    public LoginSteps() {
        loginPom = LoginPom.getINSTANCE();
    }



    @Given("User is in saucedemo webpage")
    public void sauceDemoHomePage() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }

    @When("User fills username input")
    public void userFillsUsernameInput() { driver.findElement(loginPom.getUsernameInput()).sendKeys("standard_user");
    }

    @And("Fills password input")
    public void fillsPasswordInput() {
        driver.findElement(loginPom.getPasswordInput()).sendKeys("secret_sauce");
    }

    @And("Clicks login button")
    public void clicksLoginButton() {
        driver.findElement((loginPom.getLoginBtn())).click();}


    @Then("User should be navigated to the homepage")
    public void userShouldBeNavigatedToTheHomepage() {
        Assert.assertTrue(driver.findElement(loginPom.getHomePageLogo()).isDisplayed());}


    @When("User fills username input with invalid username")
    public void userFillsUsernameInputWithInvalidUsername() {
        driver.findElement(loginPom.getUsernameInput()).sendKeys("standard_userr");
    }

    @And("Fills password input with valid passsword")
    public void fillsPasswordInputWithValidPasssword() {
        driver.findElement(loginPom.getPasswordInput()).sendKeys("secret_sauce");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        Assert.assertTrue((driver.findElement(loginPom.getLoginInputError()).isDisplayed()));
    }

    @And("Fills password input with invalid passsword")
    public void fillsPasswordInputWithInvalidPasssword() {
        driver.findElement(loginPom.getPasswordInput()).sendKeys("secret_saucee");
    }

    @When("User don't fills username input")
    public void userDonTFillsUsernameInput() {
        driver.findElement(loginPom.getUsernameInput()).sendKeys("");
    }

    @And("User don't fills password input")
    public void userDonTFillsPasswordInput() {
        driver.findElement(loginPom.getPasswordInput()).sendKeys("");
    }

    @And("Refresh the web page")
    public void refreshTheWebPage() {
        driver.navigate().refresh();
    }

    @Then("User should be navigated to the loginpage")
    public void userShouldBeNavigatedToTheLoginpage() {
        Assert.assertTrue(driver.findElement(loginPom.getHomePageLogo()).isDisplayed());}


    @And("Click error button for hide the error message")
    public void clickErrorButtonForHideTheErrorMessage() {
        driver.findElement(loginPom.getErrorBtn()).click();
    }

    @When("User fills username input field with {string}")
    public void userFillsUsernameInputFieldWithOutline(String username) {
        driver.findElement(loginPom.getUsernameInput()).sendKeys(username);

        
    }

    @And("Fills password input field with {string}")
    public void fillsPasswordInputFieldWithOutline(String password) {
        driver.findElement(loginPom.getPasswordInput()).sendKeys(password);
    }

    @Then("{string} error message should be displayed")
    public void errorMessageShouldBeDisplayed(String expectedError) {
        String actualError =  driver.findElement(By.xpath("//*[@data-test = 'error']")).getText();
        Assert.assertEquals(actualError, expectedError);
    }

    @When("Click to login button")
    public void clickToLoginButton() {
      driver.findElement(loginPom.getLoginBtn2()).click();
    }

    @Given("User is in demotelerik webpage")
    public void userIsInDemotelerikWebpage() {
        driver.get("https://demos.telerik.com/aspnet-core/eshop/Account/Login?ReturnUrl=%2Faspnet-core%2Feshop%2FProducts%2FCategory%3FsubCategory%3DMountain%2520Bikes");
    }

    @When("Refresh the link")
    public void theLickIsCorrect() {
        driver.get("https://demos.telerik.com/aspnet-core/eshop/Account/Login?ReturnUrl=%2Faspnet-core%2Feshop%2FProducts%2FCategory%3FsubCategory%3DMountain%2520Bikes");
    }

    @Given("User filtered the Moauntain Bikes")
    public void userFilteredTheMoauntainBikes() {
        driver.get("https://demos.telerik.com/aspnet-core/eshop/Products/Category?subCategory=Mountain%20Bikes");
    }


}




