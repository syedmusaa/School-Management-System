package com.jpaexample.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaexample.Entities.Student;
import com.jpaexample.Repositories.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepository;
    
    public void run(String... args) throws Exception {
        // Insert customers
    
    	}
    
    	public List<Student> getAllStudents() {
            return studentRepository.getAllStudents();
        }

        public Student getStudentById(long id) {
            return studentRepository.getStudentById(id);
        }
        
        

        public void saveStudent(Student student) {
        	studentRepository.saveStudent(student);
        }

        public void updateStudent(Student student) {
        	studentRepository.updateStudent(student);
        }

        public void deleteStudent(long id) {
        	studentRepository.deleteStudent(id);
        }
    }