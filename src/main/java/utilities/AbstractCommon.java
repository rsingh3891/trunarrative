package utilities;

import org.apache.log4j.Logger;
import org.junit.Assert;

public class AbstractCommon {

    public static Logger logger;
    protected Browser browser;

    public void setLogger() {
        final String testName = this.getClass().getSimpleName();
        logger = Logger.getLogger(testName);
    }

    protected void failTest() {
        Assert.fail();
    }
}
