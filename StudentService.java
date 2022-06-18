package service;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Student;

public class StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);


}
