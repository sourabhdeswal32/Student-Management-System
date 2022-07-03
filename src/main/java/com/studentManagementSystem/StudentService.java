package  com.studentManagementSystem;

import java.util.List;

import org.springframework.stereotype.Component;
import com.studentManagementSystem.*;

@Component
public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
