package world.sparc.automation.ui.tests.registration;

import org.testng.annotations.Test;
import world.sparc.automation.ui.pages.MainPage;


public class RegistrationTest {

    @Test
    public void byMail(){
        new MainPage()
                .open()
                .register()
                .regByMail()
                .setFirsName("pavel")
                .setLastName("Pavel")
                .setHeadLine("MBA Student at Duke University")
                .setCurrentCity("New York")
                .imOverTwelve(true)
                .setDate("1990-11-19")
                .clickNext()
        .setMail("greencitypavel@gmail.com")
        .setPass("1234qwertTy-")
        .confirmPass("1234qwertTy-")
        .clickNext()
        .addTag("Accenture")
        .clickNext()
        .signUp();
    }

}
