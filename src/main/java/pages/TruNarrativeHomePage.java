package pages;

import org.hamcrest.text.IsEqualIgnoringCase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Browser;

public class TruNarrativeHomePage extends AbstractPage {

    @FindBy(id = "burger")
    private WebElement menu;

    @FindBy(xpath = "//h4")
    private WebElement subHeading;

    @FindBy(xpath = "//*[@id='menu-item-6388']/a")
    private WebElement truNarrativeTeamLink;

    private final String expectedSubHeading = "Easy Onboarding.  Smooth Transactions.  Insightful Compliance.";

    public TruNarrativeHomePage(final Browser browser) {
        super(browser);
    }

    public void clickMenu() {
        logger.info("Clicking on the menu");
        browser.click(menu);
    }

    public TruNarrativeTeamPage navigateToTruNarrativeTeamPage() {
        clickMenu();
        clickTruNarrativeTeamLink();
        return new TruNarrativeTeamPage(browser);
    }

    public void clickTruNarrativeTeamLink() {
        logger.info("Clicking on the TruNarrative Team link");
        browser.scrollIntoView(truNarrativeTeamLink);
        browser.click(truNarrativeTeamLink);
    }

    public void verifySubHeading() {
        logger.info("Checking the sub heading");
        final String elementText = browser.getText(subHeading);
        Assert.assertThat(expectedSubHeading, IsEqualIgnoringCase.equalToIgnoringCase(elementText));
        logger.info("PASS: The sub heading contains the text " + elementText);
    }
}
