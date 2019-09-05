package pages;

import org.hamcrest.text.IsEqualIgnoringCase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Browser;

public class GoogleResultsPage extends AbstractPage {

    @FindBy(xpath = "//*/cite[@class='iUh30']")
    private WebElement firstResultLink;

    public GoogleResultsPage(Browser browserIn) {
        super(browserIn);
    }

    public void clickFirstLink() {
        logger.info("Clicking on the first result link");
        browser.click(firstResultLink);
    }

    public void verifyFirstLink(final String url) {
        final String elementText = browser.getText(firstResultLink);
        logger.info("Checking the first result link contains the link " + elementText);
        Assert.assertThat(url, IsEqualIgnoringCase.equalToIgnoringCase(elementText));
        logger.info("PASS: The first result link contains the link " + elementText);
    }
}
