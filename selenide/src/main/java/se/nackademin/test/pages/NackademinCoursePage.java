
package se.nackademin.test.pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import se.nackademin.test.pages.NackademinMenuPage;
import static org.junit.Assert.*;


public class NackademinCoursePage extends NackademinMenuPage {
    
    SelenideElement header = $(".et_pb_text_inner h2");
    
    public String getHeader() {
        return header.text();
    }
}
