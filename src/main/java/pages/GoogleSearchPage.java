package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Browser;

public class GoogleSearchPage extends AbstractPage {

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(name = "q")
    private WebElement searchField;

    public GoogleSearchPage(final Browser browser) {
        super(browser);
    }

    public GoogleResultsPage searchOnGoogle(final String searchTerm) {
        openGoogleSearchPage();
        enterSearchTerm(searchTerm);
        clickGoogleSearch();
        return new GoogleResultsPage(browser);
    }

    private void clickGoogleSearch() {
        logger.info("Clicking on the Google Search button");
        browser.click(searchButton);
    }

    private void enterSearchTerm(final String searchTerm) {
        logger.info("Entering " + searchTerm + " into the search field");
        browser.type(searchField, searchTerm);
    }

    private void openGoogleSearchPage() {
        logger.info("Opening the Google search page");
        browser.openURL("https://www.google.com");
    }
}
