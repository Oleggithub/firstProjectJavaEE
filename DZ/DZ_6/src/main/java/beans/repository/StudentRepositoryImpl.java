package beans.repository;

import beans.model.Student;
import beans.model.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {

    public List<Student> getStudents() {

        List<Student> students = new ArrayList<Student>();

        Student student = new Student("River", "Song", 25);
        Student student2 = new Student("Smith", "John", 35);

        students.add(student);
        students.add(student2);

        return students;
    }
}

