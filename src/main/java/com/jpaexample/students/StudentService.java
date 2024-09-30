package com.jpaexample.students;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo StudentRepository;
    
    public void run(String... args) throws Exception {
        // Insert customers
    
    	StudentRepository.insert(new Student(1, "Vikram Chauhan", 33, "vikram.chauhan@example.com", 12, 706715875));}
    
    	public List<Student> getAllStudents() {
            return StudentRepository.getAllStudents();
        }

        public Student getStudentById(long id) {
            return StudentRepository.getStudentById(id);
        }
        
        

        public void saveStudent(Student student) {
        	StudentRepository.saveStudent(student);
        }

        public void updateStudent(Student student) {
        	StudentRepository.updateStudent(student);
        }

        public void deleteStudent(long id) {
        	StudentRepository.deleteStudent(id);
        }
    }