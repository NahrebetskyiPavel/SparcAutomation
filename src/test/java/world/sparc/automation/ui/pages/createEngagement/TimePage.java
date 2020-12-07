package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import java.security.Key;

import static com.codeborne.selenide.Selenide.*;

public class TimePage {

    @Step("set start time")
    public TimePage setStartTime(String time){
        $("input[placeholder='Choose a Start Time']").click();
        $("input[placeholder='Choose a Start Time']").setValue(time);
        $("input[placeholder='Choose a Start Time']").pressEnter();
        return this;
    }
    @Step("open calendar")
    public TimePage openCalendar(){
        $("div.el-date-editor").click();
        return this;
    }
    @Step("chose date")
    public TimePage setDate(int date){
        $x("//span[contains(text(),'"+date+"')]").click();
        return this;
    }
    @Step("set end time")
    public TimePage     seEndTime(String time){
        $("input[placeholder='Choose an End Time']").click();
        $("input[placeholder='Choose an End Time']").setValue(time);
        Selenide.getFocusedElement().sendKeys(Keys.ENTER);
        return this;
    }
    @Step("next")
    public DetailsPage clickNext(){
        $x("//button[contains(text(),'Next')]").click();
        return new DetailsPage();
    }
    @Step
    public DescriptionPage clickBack(){
        $x("//button[contains(text(),'Back')]").click();
        return new DescriptionPage();
    }

}
