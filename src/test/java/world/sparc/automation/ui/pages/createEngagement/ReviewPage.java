package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import world.sparc.automation.ui.pages.comon.BasePage;
import world.sparc.automation.ui.pages.host.HostPage;

import static com.codeborne.selenide.Selenide.$$x;

public class ReviewPage extends BasePage {
   @Getter private ElementsCollection createEngagement =    $$x("//button[contains(text(),'Create Engagement')]");

   public HostPage createEngagement(){
       createEngagement.get(0).click();
       return new HostPage();
   }
}
