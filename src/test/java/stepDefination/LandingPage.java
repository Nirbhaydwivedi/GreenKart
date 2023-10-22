package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TextContext;

import java.io.IOException;

public class LandingPage {

    TextContext tc;

    public LandingPage(TextContext txt)
    {
        this.tc=txt;
    }
    @Given("User Launch the Browser")
    public void user_launch_the_browser() throws IOException {
tc.pom.getHomePageObject().validateLogo();

    }
    @When("Search the {string}")
    public void search_the(String string) {
tc.pom.getHomePageObject().searchTheProduct(string);
    }
    @Then("Add to kart and Navigate on Deals Page")
    public void add_to_kart_and_navigate_on_deals_page() {
tc.pom.getHomePageObject().addProductInCart();
tc.pom.getHomePageObject().clickOnTopDealsLink();
    }

}
