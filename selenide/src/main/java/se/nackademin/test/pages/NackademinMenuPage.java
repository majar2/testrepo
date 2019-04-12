
package se.nackademin.test.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import com.codeborne.selenide.SelenideElement;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;


public class NackademinMenuPage {
    
    private static final Logger LOG = Logger.getLogger(NackademinMenuPage.class.getName());
    SelenideElement searchIcon = $(".na-header-search");
    SelenideElement searchField = $(".na-header-search-form:nth-child(2) input");
    SelenideElement submitButton = $("button[type=submit]");
    
    public void setSearchValue(String query){
        LOG.info("searching for " + query);
        searchIcon.click();
        searchField.clear();
        searchField.sendKeys(query);
    }
    
    public void submitSearch(){
        submitButton.click();
    }
    
    public void clickMenuItemInUtbildningar(String item) {
        
        $("#menu-item-2168").hover();
        for (SelenideElement element:$$("#menu-item-2168 a")) {
            //System.out.println(element.find(".menu-title").text());
            if (item.equals(element.find(".menu-title").text())) {
                element.click();
                break;
            }
        }
    }
}
