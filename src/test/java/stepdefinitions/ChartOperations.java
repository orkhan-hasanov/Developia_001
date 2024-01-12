package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class ChartOperations extends BaseMethods {



    @And("Add to Chart Sauce Labs Backpack")
    public void clicksSauceLabsBackpack()  {

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();


    }

    @And("Go to the chart")
    public void goToTheChart() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Then("The item must be selected")
    public void theItemMustBeSelected() {
        Assert.assertTrue(driver.findElement(By.className("inventory_item_name")).isDisplayed());}
    

    @And("Remove the Sauce Labs Backpack")
    public void removeTheSauceLabsBackpack() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Then("The chart must be empty")
    public void theChartMustBeEmpty() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed();
    }

    @And("Add to Chart Sauce Labs Bike Light")
    public void addToChartSauceLabsBikeLight() {
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }

    @Then("The two items must be selected")
    public void theTwoItemsMustBeSelected() {
        WebElement cartItemCount = driver.findElement(By.className("shopping_cart_badge"));
        int itemCount = Integer.parseInt(cartItemCount.getText());
        Assert.assertEquals(itemCount, 2, "Number of items in the cart is not as expected.");

    }

    @And("Add to Chart Sauce Labs Bolt T-Shirt")
    public void addToChartSauceLabsBoltTShirt() {
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    }

    @Then("The three items must be selected")
    public void theThreeItemsMustBeSelected() {
        WebElement cartItemCount = driver.findElement(By.className("shopping_cart_badge"));
        int itemCount = Integer.parseInt(cartItemCount.getText());
        Assert.assertEquals(itemCount, 3, "Number of items in the cart is not as expected.");
    }

    @And("Remove the Sauce Labs Bike Light")
    public void removeTheSauceLabsBikeLight() {
        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
    }

    @And("Add to Chart Sauce Labs Fleece Jacket")
    public void addToChartSauceLabsFleeceJacket() {
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    }

    @Then("The four items must be selected")
    public void theFourItemsMustBeSelected() {
        WebElement cartItemCount = driver.findElement(By.className("shopping_cart_badge"));
        int itemCount = Integer.parseInt(cartItemCount.getText());
        Assert.assertEquals(itemCount, 4, "Number of items in the cart is not as expected.");
    }

    @And("Remove Chart Sauce Labs Fleece Jacket")
    public void removeChartSauceLabsFleeceJacket() {
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
    }

    @And("Add to Chart Sauce Labs Onesie")
    public void addToChartSauceLabsOnesie() {
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
    }

    @And("Go to the chart Test.allTheThings\\() T-Shirt \\(Red)")
    public void goToTheChartTestAllTheThingsTShirtRed() {
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
    }
}