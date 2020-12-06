package world.sparc.automation.ui.tests.registration;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import world.sparc.automation.helpers.data.User;
import world.sparc.automation.ui.pages.MainPage;
import world.sparc.automation.ui.pages.Registration;
import world.sparc.automation.ui.tests.runner.Runner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;


public class RegistrationTest extends Runner {

    @Test
    public void byMail() throws InterruptedException {

        new MainPage()
                .open()
                .register()
                .regByMail()
                .setFirsName(user.getName())
                .setLastName(user.getLastName())
                .setMail(user.getEmail())
                .setPass(user.getPassword())
                .confirmPass(user.getConfirmPassword())
                .setHeadLine("MBA Student at Duke University")
                .setCurrentCity("New York")
                .togleAgrementCheckBox()
                .signUp();
        $x("//p[contains(text(),'Thank you for signing up!')]").shouldBe(visible);
    }

}
