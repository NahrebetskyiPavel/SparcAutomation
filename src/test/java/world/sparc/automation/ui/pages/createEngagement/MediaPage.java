package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import world.sparc.automation.ui.pages.Registration;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;

public class MediaPage {
    @Getter private ElementsCollection fileInputs = $$("input.custom-file-input");
    @Getter private SelenideElement addImageBtn = $x("//button[contains(text(),'Add image')]");
    @Getter private SelenideElement uploadBtn = $x("//button[contains(text(),'Upload Image')]");
    @Getter private SelenideElement confirmBtn = $x("//button[contains(text(),'Confirm')]");
    @Getter private SelenideElement cancelBtnBtn = $x("//button[contains(text(),'Cancel')]");
    @Getter private SelenideElement uploadImageBtn = $x("//button[contains(text(),'Upload Image')]");
    @Getter private SelenideElement useImageBtb = $x("//button[contains(text(),'Use Image')]");

    @Step
    public MediaPage addImage(String path){
        File file = new File(path);
        $("input.custom-file-input").uploadFile(file);
        return this;
    }

    @SneakyThrows
    @Step("add profile photo")
    public MediaPage addImage(){
        addImageBtn.click();
        File file = new File("img.png");
        $("div.modal--body input").uploadFile(file);
        useImageBtb.click();
        confirmBtn.click();
        return this;
    }
    @Step
    public MediaPage addFile(int index, String path){
        File file = new File(path);
        fileInputs.get(index).uploadFile(file);
        return this;
    }
    @Step("add file")
    public MediaPage addFile(int index){
        File file = new File("img.png");
        fileInputs.get(index).uploadFile(file);
        return this;
    }
    @Step("next")
    public RegistrationPage clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return new RegistrationPage();
    }
    @Step
    public PricePage clickBack() {
        $x("//button[contains(text(),'Back')]").click();
        return new PricePage();
    }
}
