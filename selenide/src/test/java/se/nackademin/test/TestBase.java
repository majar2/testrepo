

package se.nackademin.test;

import static com.codeborne.selenide.Selenide.open;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestBase {
    
    public TestBase() {
    }
    
    @Before
    public void setUp() {
        open("https://nackademin.se");
    }
    
}
