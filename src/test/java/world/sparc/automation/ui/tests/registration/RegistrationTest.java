package world.sparc.automation.ui.tests.registration;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import world.sparc.automation.ui.pages.MainPage;
import world.sparc.automation.ui.pages.Registration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;


public class RegistrationTest {

    @Test
    public void byMail() throws InterruptedException {
        new MainPage()
                .open()
                .register()
                .regByMail()
                .setFirsName("pavel")
                .setLastName("Pavel")
                .setMail("greencitypavel+12215363@gmail.com")
                .setPass("1234qwertTy-")
                .confirmPass("1234qwertTy-")
                .setHeadLine("MBA Student at Duke University")
                .setCurrentCity("New York")
                .togleAgrementCheckBox()
                .signUp();
        $x("//p[contains(text(),'Thank you for signing up!')]").shouldBe(visible);
        Thread.sleep(1000*10);
    }

}
