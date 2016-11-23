package auntification;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by b_nop on 23.11.2016.
 */
public class sustemAuntefication {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Oleg");
        user.setSurname("Mir");
        user.setAge(39);
        user.setRole(UserRole.USER);

        User user1 = new User();
        user1.setName("Oleg1");
        user1.setSurname("Mir1");
        user1.setAge(40);
        user1.setRole(UserRole.ADMIN);

        User user2 = new User();
        user2.setName("Oleg2");
        user2.setSurname("Mir2");
        user2.setAge(41);
        user2.setRole(UserRole.SUPER_USER);

        Object[] arr = new Object[3];
        arr[0] = user;
        arr[1] = user1;
        arr[2] = user2;
        System.out.println("Massiv Objektov -> " + Arrays.deepToString(arr));

        UserRole[] arr1 = new UserRole[3];
        arr1[0] = UserRole.ADMIN;
        arr1[1] = UserRole.USER;
        arr1[2] = UserRole.SUPER_USER;
        System.out.println("Massiv Roles -> " + Arrays.deepToString(arr1));

        System.out.println();
        while (true) {
            System.out.println();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Role or EXIT: ");
            String input_role = input.nextLine();
            UserRole role = UserRole.valueOf(input_role);
            if (role == UserRole.EXIT) {
                System.out.println("Non Role");
                break;}
            switch (role) {
                case USER:
                    enumTest firstRoleU = new enumTest(UserRole.USER);
                    firstRoleU.printRole();
                    System.out.println("User auntification - > ");
                    System.out.print("user1 = " + user);
                    break;
                case ADMIN:
                    enumTest secondRoleA = new enumTest(UserRole.ADMIN);
                    secondRoleA.printRole();
                    System.out.println("User auntification - > ");
                    System.out.print("user2 = " + user1);
                    break;
                case SUPER_USER:
                    enumTest threeRoleS = new enumTest(UserRole.SUPER_USER);
                    threeRoleS.printRole();
                    System.out.println("User auntification - > ");
                    System.out.print("user3 = " + user2);
                    break;
                default:
                    System.out.println("Non Role");
                    break;
            }
        }
    }
}


