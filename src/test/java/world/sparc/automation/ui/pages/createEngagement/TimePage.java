package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

import java.security.Key;

import static com.codeborne.selenide.Selenide.*;

public class TimePage {
    public TimePage setStartTime(String time){
        $("input[placeholder='Choose a Start Time']").click();
        $("input[placeholder='Choose a Start Time']").setValue(time);
        $("input[placeholder='Choose a Start Time']").pressEnter();
        return this;
    }

    public TimePage openCalendar(){
        $("div.el-date-editor").click();
        return this;
    }

    public TimePage setDate(int date){
        $x("//span[contains(text(),'"+date+"')]").click();
        return this;
    }

    public TimePage     seEndTime(String time){
        $("input[placeholder='Choose an End Time']").click();
        $("input[placeholder='Choose an End Time']").setValue(time);
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
