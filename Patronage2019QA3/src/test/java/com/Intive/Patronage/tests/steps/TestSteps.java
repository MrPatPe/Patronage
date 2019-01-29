package com.Intive.Patronage.tests.steps;
import com.Intive.Patronage.tests.pages.GooglePage;
import com.Intive.Patronage.tests.pages.TestPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.Intive.Patronage.tests.DriverFactory;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestSteps extends DriverFactory {

    TestPage AutomationPage = new TestPage(driver);

    @Given("^User is on Automationpractice page$")
    public void userIsOnGooglePage()  {
        AutomationPage.openAutomationPage();
    }

    @When("^I search Automationpractice with phrase \"([^\"]*)\"$")
    public void iSearchAutomationpracticeWithPhrase(String searchPhrase){
        AutomationPage.searchInAutomationpractice(searchPhrase);
    }

    @Then("^I am on Automationpractice sign in page$")
    public void iAmOnAutomationsigninpage()  {
        String actualURL = driver.getCurrentUrl();
        assertThat("User should be on Automation sign in page", actualURL.equals("http://automationpractice.com/index.php?controller=authentication&back=my-account"));
    }

    @When("^User press Sign In button$")
    public void pressSignInButton() {
        AutomationPage.signInButton.click();
     }
    @Then("^Search query have phrase \"([^\"]*)\"$")
    public void iSearchblack(String searchPhrase) {
        String searchtext = AutomationPage.searchField.getAttribute("value");
        assertThat("User should see the same text which he wrote", searchPhrase.equals(searchtext));

    }
}
