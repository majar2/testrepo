
package se.nackademin.test;

import se.nackademin.test.pages.NackademinSearchResultPage;
import se.nackademin.test.pages.NackademinMenuPage;
import se.nackademin.test.pages.NackademinCoursePage;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Selenide;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class NackademinTest extends TestBase {
    
    
    @Test
    public void testSearch() {
        
        String query = "Programutvecklare Java";
        
        
        NackademinMenuPage nackademinMenuPage = page(NackademinMenuPage.class);                   
        nackademinMenuPage.setSearchValue(query);
        nackademinMenuPage.submitSearch();
        
        NackademinSearchResultPage nackademinSearchResultPage = page(NackademinSearchResultPage.class);
        List<String> results = nackademinSearchResultPage.getSearchResults();
        
        //assert if article is found
        assertTrue(nackademinSearchResultPage.resultExists(query));
        
        nackademinSearchResultPage.clickSearchResult(query);
        Selenide.sleep(3000);
        NackademinCoursePage nackademinCoursePage = page(NackademinCoursePage.class);
        assertEquals("Course page shows correct header", query, nackademinCoursePage.getHeader());
        
        }
    
    @Test
    public void testMenu() {
        String menuitem="Bygg";
        
        NackademinMenuPage nackademinMenuPage = page(NackademinMenuPage.class);
        nackademinMenuPage.clickMenuItemInUtbildningar(menuitem);
        Selenide.sleep(3000);
        assertEquals("Correct category is shown",menuitem,$(".active-category").text());
    }
    
    
    

        
        
    }
    
    

