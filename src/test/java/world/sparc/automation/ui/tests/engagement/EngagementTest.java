package world.sparc.automation.ui.tests.engagement;

import org.testng.annotations.Test;
import world.sparc.automation.ui.pages.MainPage;

public class EngagementTest {

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
        .setStartTime()
        .seEndTime()
        .clickNext();
    }
}
