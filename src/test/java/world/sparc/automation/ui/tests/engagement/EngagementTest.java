package world.sparc.automation.ui.tests.engagement;

import org.testng.annotations.Test;
import world.sparc.automation.ui.pages.MainPage;
import world.sparc.automation.ui.pages.comon.BasePage;
import world.sparc.automation.ui.pages.createEngagement.DetailsPage;
import world.sparc.automation.ui.tests.runner.Runner;

import static world.sparc.automation.ui.pages.createEngagement.DetailsPage.*;
import static world.sparc.automation.ui.pages.createEngagement.DetailsPage.Privacy.*;

public class EngagementTest extends Runner {

    @Test
    public void createEngagement(){
        new MainPage()
        .open()
        .openLoginForm()
        .setLogin("greencitypavel@gmail.com")
        .setPass("1234qwertTy-")
        .confirmLogin()
            .openUserMenu()
            .createEngagement()
                .setTitle("TitlePage")
                .addTag("Best")
                .clickNext()
                .addDescription()
                .clickNext()
                        .openCalendar()
                        .setDate(12)
                        .setStartTime("00:44:00")
                        .seEndTime("08:44:00")
                        .clickNext()
                            .chosePrivacy(PRIVATE)
                            .setCapacity(1)
                            .addConferenceLink("https://meet.google.com/wbq-fzon-wzk?authuser=0")
                            .addEngagementInstructions(new BasePage().getLorem().getWords(5,10))
                            .clickNext();
    }
}
