package world.sparc.automation.ui.pages.createEngagement;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

import static com.codeborne.selenide.Selenide.*;

public class DescriptionPage {
    Lorem lorem = LoremIpsum.getInstance();

    public DescriptionPage addDescription(){

        $("textarea").setValue(lorem.getWords(7,12));
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
