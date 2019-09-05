package pages;

import cucumber.api.DataTable;
import gherkin.formatter.model.DataTableRow;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Browser;

public class TruNarrativeTeamPage extends AbstractPage {

    private final String profilesXPath = "//article/div/div";

    @FindBy(xpath = "//*[@id='main-content-wrapper']/section[2]/div/article/div/div[5]/div[2]/div/p")
    private WebElement ctoText;

    @FindBy(xpath = "//*[@id='main-content-wrapper']/section[2]/div/article/div/div[5]/div[2]/div/h2")
    private WebElement davidEastaughText;

    @FindBy(xpath = "//*[@id='main-content-wrapper']/section[2]/div/article/div/div[1]/div[2]/div/p")
    private WebElement founderAndCeoText;

    @FindBy(xpath = "//*[@id='main-content-wrapper']/section[2]/div/article/div/div[8]/div[2]/div/p")
    private WebElement hrManagerText;

    @FindBy(xpath = "//*[@id='main-content-wrapper']/section[2]/div/article/div/div[1]/div[2]/div/h2")
    private WebElement johnLordText;

    @FindBy(xpath = "//*[@id='main-content-wrapper']/section[2]/div/article/div/div[8]/div[2]/div/h2")
    private WebElement nicolaJanneyText;

    public TruNarrativeTeamPage(final Browser browser) {
        super(browser);
    }

    public void checkNamesAndRoles(final DataTable teamMembersTable) {
        String actualName;
        String actualRole;
        String expectedName;
        String expectedRole;

        for(DataTableRow row : teamMembersTable.getGherkinRows()) {
            expectedName = row.getCells().get(0);
            expectedRole = row.getCells().get(1);
            switch (expectedName) {
                case("John Lord"):
                    actualName = browser.getText(johnLordText);
                    actualRole = browser.getText(founderAndCeoText);
                    verifyNamesAndRoles(actualName, actualRole, expectedName, expectedRole);
                    break;
                case("David Eastaugh"): {
                    actualName = browser.getText(davidEastaughText);
                    actualRole = browser.getText(ctoText);
                    verifyNamesAndRoles(actualName, actualRole, expectedName, expectedRole);
                    break;
                }
                case("Nicola Janney"): {
                    actualName = browser.getText(nicolaJanneyText);
                    actualRole = browser.getText(hrManagerText);
                    verifyNamesAndRoles(actualName, actualRole, expectedName, expectedRole);
                    break;
                }
            }
        }
    }

    public void checkNumberOfProfiles(final int expectedProfiles) {
        logger.info("Getting the number of profiles on the page");
        final int actualProfiles = getNumberOfProfiles();
        Assert.assertEquals(actualProfiles, expectedProfiles);
        logger.info("PASS: Expected number of profiles " + expectedProfiles + " found");
    }

    private int getNumberOfProfiles() {
        return browser.getNumberOfElementsByXpath(profilesXPath);
    }

    private void verifyNamesAndRoles(final String actualName, final String actualRole,
                                     final String expectedName, final String expectedRole) {
        Assert.assertEquals(actualName, expectedName);
        logger.info("PASS: Found name " + expectedName);
        Assert.assertEquals(actualRole, expectedRole);
        logger.info("PASS: Found corresponding role " + expectedRole);
    }

}
