
package se.nackademin.test.pages;

import se.nackademin.test.pages.NackademinMenuPage;
import static com.codeborne.selenide.Selenide.$$;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;


public class NackademinSearchResultPage extends NackademinMenuPage {
    
    private static final Logger LOG = Logger.getLogger(NackademinSearchResultPage.class.getName());
    public List<String> getSearchResults(){
        return $$("#left-area h2").texts();
    }
    
    public void clickSearchResult(String name){
        for (SelenideElement element:$$("#left-area article")) {
                    if (element.find("h2").text().equals(name)){
                        element.find("a").click();
                        return;
                    }
            }
        throw new NoSuchElementException("Could not find search result with text " + name);
    }
    
    public Boolean resultExists(String name) {
        LOG.info("Check if result is listed: " + name);
        Boolean exists = false;
        for (SelenideElement element:$$("#left-area article")) {
                    if (element.find("h2").text().equals(name)){
                        exists = true;
                        break;
                    }
            }
        return exists;
        }
}
