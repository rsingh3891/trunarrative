package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleResultsPage;
import pages.GoogleSearchPage;
import pages.TruNarrativeHomePage;
import pages.TruNarrativeTeamPage;
import utilities.Browser;

public class TruNarrativeTeamStepDefinitions {

    private Browser browser;
    private GoogleResultsPage googleResultsPage;
    private TruNarrativeHomePage homePage;
    private TruNarrativeTeamPage teamPage;

    @Given("I search for (.*) on Google")
    public void searchOnGoogle(final String searchTerm) {
        browser = new Browser();
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(browser);
        googleResultsPage = googleSearchPage.searchOnGoogle(searchTerm);
        googleResultsPage.verifyFirstLink("https://" + searchTerm + ".com");
    }

    @Given("I click on the link for the (.*) website")
    public void clickFirstResultLink(final String searchTerm) {
        googleResultsPage.clickFirstLink();
        homePage = new TruNarrativeHomePage(browser);
        homePage.verifySubHeading();
    }

    @When("I navigate to the TruNarrative leadership team page")
    public void navigateToLeadershipTeamPage() {
        teamPage = homePage.navigateToTruNarrativeTeamPage();
    }

    @Then("there are (\\d+) people in the leadership team")
    public void verifyNumberInTheLeadershipTeam(final int expectedProfiles) {
        teamPage.checkNumberOfProfiles(expectedProfiles);
    }

    @Then("the following names have the following roles:")
    public void verifyNamesAndRoles(DataTable teamMembers) {
        teamPage.checkNamesAndRoles(teamMembers);
        browser.quit();
    }
}
