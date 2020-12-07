package world.sparc.automation.ui.pages.createEngagement;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import world.sparc.automation.ui.pages.comon.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class DescriptionPage extends BasePage {

    public DescriptionPage addDescription(){
        $("textarea").setValue(getLorem().getWords(7,12));
        return this;
    }

    public TimePage clickNext(){
        $x("//button[contains(text(),'Next')]").click();
        return new TimePage();
    }

    public TitlePage clickBack(){
        $x("//button[contains(text(),'Back')]").click();
        return new TitlePage();
    }

}
