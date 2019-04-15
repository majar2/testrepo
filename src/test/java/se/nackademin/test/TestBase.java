

package se.nackademin.test;

import static com.codeborne.selenide.Selenide.open;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import se.nackademin.test.pages.NackademinSearchResultPage;


public class TestBase {
    
    private static final Logger LOG = Logger.getLogger(TestBase.class.getName());
    
    public TestBase() {
    }
    
    @Before
    public void setUp() {
        LOG.info("open startpage");
        
        open("https://nackademin.se");
    }
    
}
