

package se.nackademin.test;

import static com.codeborne.selenide.Selenide.open;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {
    
    public TestBase() {
    }
    
    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        open("https://nackademin.se");
    }
    
}
