package auntification;

/**
 * Created by b_nop on 23.11.2016.
 */
public class sustemAuntefication {
    public static void main(String[] args) {

        User user = new User();

        Object[] arr = new Object[3];
        arr[0] = user.getName();
        arr[1] = user.getSurname();
        arr[2] = user.getAge();
        //arr[3] = user.getRole();


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

        enumTest firstRoleU = new enumTest(UserRole.USER);

        System.out.print("user = " + user.getName() + "," + user.getSurname() +","+ user.getAge() + ",");
        firstRoleU.printRole();

        enumTest secondRoleA = new enumTest(UserRole.ADMIN);
        System.out.print("user = " + user.getName() + "," + user.getSurname() +","+ user.getAge() + ",");
        secondRoleA.printRole();
        enumTest threeRoleS = new enumTest(UserRole.SUPER_USER);
        System.out.print("user = " + user.getName() + "," + user.getSurname() +","+ user.getAge() + ",");
        threeRoleS.printRole();

    }
}
