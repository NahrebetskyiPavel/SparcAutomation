package world.sparc.automation.helpers.data;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class User {

    @Getter @Setter private String email;
    @Getter @Setter private String name;
    @Getter @Setter private String lastName;
    @Getter @Setter private String password;
    @Getter @Setter private String confirmPassword;

    /**
     * Constructor.
     * @param email
     * @param password
     */
    public User(String email, String password) {
        this.email = email;
        this.name = "";
        this.password = password;
        this.confirmPassword = "";
    }

    /**
     * Constructor.
     * @param email
     * @param name
     * @param password
     */
    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.confirmPassword = "";
    }

    /**
     * Constructor.
     * @param name
     * @param email
     * @param password
     * @param confirmPassword
     */
    public User(String name, String email,
                String password, String confirmPassword) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", firstName=" + name+ ", lastName=" + lastName + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
    }

}
