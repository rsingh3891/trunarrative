package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.AbstractCommon;
import utilities.Browser;

public class AbstractPage extends AbstractCommon {

    public AbstractPage(final Browser browserIn) {
        this.browser = browserIn;
        PageFactory.initElements(browser.getDriver(), this);
    }
}
