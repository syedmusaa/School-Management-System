package com.jpaexample.html.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }
    

    // Create a new student
    @PostMapping ("/register")
    public void saveStudent(@RequestBody Student student) {
    	studentService.saveStudent(student);
    }

    // Update an existing student
    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable long id, @RequestBody Student student) {
    	student.setId(id);
    	studentService.updateStudent(student);
    }

    // Delete a student by ID
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id) {
    	studentService.deleteStudent(id);
}
}
