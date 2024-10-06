package com.jpaexample.html.students;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepository;
    
    public void run(String... args) throws Exception {
        // Insert customers
    
    	studentRepository.insert(new Student(1, "Vikram Chauhan", 33, "vikram.chauhan@example.com", 12, 706715875));}
    
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