package world.sparc.automation.ui.pages.comon;

import com.codeborne.selenide.SelenideElement;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

  @Getter private Lorem lorem = LoremIpsum.getInstance();
  @Getter private SelenideElement loadingLogo  =$("img.loading-logo");
  @Getter private SelenideElement loadingCircle = $("svg.loading-center");
  @Getter private SelenideElement loadingCirclePercentage = $("svg.loading-center text");
}
