package world.sparc.automation.ui.pages.comon;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import lombok.Getter;

public class BasePage {
  @Getter  private Lorem lorem = LoremIpsum.getInstance();
}
