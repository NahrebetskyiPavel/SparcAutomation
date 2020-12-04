package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

import java.security.Key;

import static com.codeborne.selenide.Selenide.*;

public class TimePage {
    public TimePage setStartTime(){
        $("input[placeholder='Choose a Start Time']").click();
        Selenide.getFocusedElement().sendKeys(Keys.ARROW_UP);
        Selenide.getFocusedElement().sendKeys(Keys.ARROW_UP);
        $("input[placeholder='Choose a Start Time']").pressEnter();

        return this;
    }

    public TimePage seEndTime(){
        $("input[placeholder='Choose an End Time']").click();
        $$x("//*[contains(text(),'10 PM')]").get(1).click();
        Selenide.getFocusedElement().sendKeys(Keys.ARROW_DOWN);
        Selenide.getFocusedElement().sendKeys(Keys.ENTER);
        return this;
    }

    public DetailsPage clickNext(){
        $x("//button[contains(text(),'Next')]").click();
        return new DetailsPage();
    }

    public DescriptionPage clickBack(){
        $x("//button[contains(text(),'Back')]").click();
        return new DescriptionPage();
    }

}
