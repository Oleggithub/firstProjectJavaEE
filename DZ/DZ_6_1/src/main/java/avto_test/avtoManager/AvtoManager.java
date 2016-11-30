package avto_test.avtoManager;

import avto_test.avto.Avto;
import avto_test.avtoService.AvtoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
public class AvtoManager {
    public static void main(String[] args) {


//        UserService userService = new UserServiceImpl();
//        List<User> allUsers = userService.getAllUsers();
//        for (User user : allUsers){
//            System.out.println("user = " + user);
//        }

    //sozdaem contex

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml"); // ischet path k resource
    AvtoService avtoService =context.getBean("avtoService", AvtoService.class);
    //AvtoService avtoService = context.getBean("avtoService", AvtoService.class); // poluchili iz xml v resources
    // AvtoRepo avtoRepo = context.getBean("avtoRepo", AvtoRepo.class);// poluchili iz xml v resources



   // System.out.println("avtoService = " + avtoService);
    // System.out.println("avtoRepo = " + avtoRepo);

    List<Avto> allAvto = avtoService.getAllAvto();
    for (Avto avto : allAvto){
        System.out.println("avto = " + avto);
    }

}
}
