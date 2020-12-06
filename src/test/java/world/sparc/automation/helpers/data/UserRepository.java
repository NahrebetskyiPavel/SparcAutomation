package world.sparc.automation.helpers.data;

import lombok.SneakyThrows;
import org.ajbrown.namemachine.NameGenerator;
import org.testng.annotations.BeforeMethod;

public class UserRepository {
    private NameGenerator generator;
    @BeforeMethod
   private void initiateGenerator(){
         generator = new NameGenerator();
    }

    @SneakyThrows
    public User temporary() {
        return new User(
                generator.generateName().getFirstName(),
                "greencitypavel@gmail.com".replace("@", getRandom() + "@"),
                "1234qwertY-",
                "1234qwertY-");
    }

    private String getRandom() {
        return String.format("%s, %d", "+", (int) (Math.random() * ((Integer.MAX_VALUE - 1) - 10 + 1) + 1))
                .replaceAll("\\s+", "")
                .replace("-", "")
                .replace(",", "");
    }
}
