package auntification;

/**
 * Created by b_nop on 23.11.2016.
 */
public class enumTest {

    UserRole userRole;
    public enumTest(UserRole userRole) {
        this.userRole = userRole;
    }
    public void printRole() {
        switch (userRole) {
            case ADMIN:
                System.out.println("ADMIN");
                break;

            case USER:
                System.out.println("USER");
                break;

            case SUPER_USER:
                System.out.println("SUPER_USER");
                break;

            default:
                System.out.println("Non Role");
                break;
        }
    }
}
