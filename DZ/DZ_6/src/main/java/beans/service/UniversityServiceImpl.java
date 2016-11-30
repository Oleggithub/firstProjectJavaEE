package beans.service;

import beans.model.Student;
import beans.model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
@Service("universityService")
public class UniversityServiceImpl implements UniversityService {

    StudentRepository studentRepository; // = new StudentRepositoryImpl();

    public UniversityServiceImpl() {
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAvailableStudents() {
        return studentRepository.getStudents();
    }

}

