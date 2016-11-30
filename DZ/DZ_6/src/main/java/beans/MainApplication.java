package beans;

import beans.model.Student;
import beans.service.UniversityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
public class MainApplication {
    public static void main(String[] args) {

        //UniversityService universityService = new UniversityServiceImpl();

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UniversityService universityService = applicationContext.getBean("universityService", UniversityService.class);

        List<Student> students = universityService.getAvailableStudents();

        for (Student student : students) {
            System.out.println(student.getLastname() +
                    " " + student.getFirstname() +
                    " " + student.getAge() + " years old");
        }
    }
}
