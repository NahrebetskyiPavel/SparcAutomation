package world.sparc.automation.ui.pages.host;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HostPage {
   @Getter private SelenideElement emailNotificationToggle = $("input.custom-control-input");
   @Getter private ElementsCollection eventCards = $$("div.event-card");
}
