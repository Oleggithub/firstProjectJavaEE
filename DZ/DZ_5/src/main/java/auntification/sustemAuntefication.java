package auntification;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by b_nop on 23.11.2016.
 */
public class sustemAuntefication {
    public static void main(String[] args) throws NoSuchFieldException {

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
//                    enumTest firstRoleU = new enumTest(UserRole.USER);
//                    firstRoleU.printRole();
                    UserAutentification.class.getFields();
                    UserAutentification firstRoleU = new UserAutentification() {
                        public boolean equals(Object obj) {
                            return false;
                        }

                        public int hashCode() {
                            return 0;
                        }

                        public String toString() {
                            return null;
                        }

                        public Class<? extends Annotation> annotationType() {
                            return null;
                        }

                        public UserRole userRoleS() {
                            return UserRole.SUPER_USER;
                        }

                        public UserRole userRoleA() {
                            return UserRole.ADMIN;
                        }

                        public UserRole userRoleU() {
                            return UserRole.USER;
                        }
                    };
                    System.out.println(firstRoleU.userRoleU());
                    System.out.println("User auntification - > ");
                    System.out.print("user1 = " + user + firstRoleU.userRoleU());
                    break;
                case ADMIN:
//                    enumTest firstRoleA = new enumTest(UserRole.ADMIN);
//                    firstRoleA.printRole();
                    UserAutentification.class.getFields();
                    UserAutentification firstRoleA = new UserAutentification() {
                        public boolean equals(Object obj) {
                            return false;
                        }

                        public int hashCode() {
                            return 0;
                        }

                        public String toString() {
                            return null;
                        }

                        public Class<? extends Annotation> annotationType() {
                            return null;
                        }

                        public UserRole userRoleS() {
                            return UserRole.SUPER_USER;
                        }

                        public UserRole userRoleA() {
                            return UserRole.ADMIN;
                        }

                        public UserRole userRoleU() {
                            return UserRole.USER;
                        }
                    };
                    System.out.println(firstRoleA.userRoleA());
                    System.out.println("User auntification - > ");
                    System.out.print("user1 = " + user1 + firstRoleA.userRoleA());
                    break;
                case SUPER_USER:
//                    enumTest firstRoleS = new enumTest(UserRole.SUPER_USER);
//                    firstRoleS.printRole();
                    UserAutentification.class.getFields();
                    UserAutentification firstRoleS = new UserAutentification() {
                        public boolean equals(Object obj) {
                            return false;
                        }

                        public int hashCode() {
                            return 0;
                        }

                        public String toString() {
                            return null;
                        }

                        public Class<? extends Annotation> annotationType() {
                            return null;
                        }

                        public UserRole userRoleS() {
                            return UserRole.SUPER_USER;
                        }

                        public UserRole userRoleA() {
                            return UserRole.ADMIN;
                        }

                        public UserRole userRoleU() {
                            return UserRole.USER;
                        }
                    };
                    System.out.println(firstRoleS.userRoleS());
                    System.out.println("User auntification - > ");
                    System.out.print("user1 = " + user2 + firstRoleS.userRoleS());
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("Non Role");
                    break;
            }
        }
    }
}


