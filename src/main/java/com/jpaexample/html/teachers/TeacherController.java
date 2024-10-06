package com.jpaexample.html.teachers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
    private TeacherService teacherService;

    // Get all students
    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable long id) {
        return teacherService.getTeacherById(id);
    }

    // Create a new student
    @PostMapping ("/registration")
    public void saveTeacher(@RequestBody Teacher teacher) {
    	teacherService.saveTeacher(teacher);
    }

    // Update an existing student
    @PutMapping("/update/{id}")
    public void updateTeacher(@PathVariable long id, @RequestBody Teacher teacher) {
    	teacher.setId(id);
    	teacherService.updateTeacher(teacher);
    }

    // Delete a student by ID
    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable long id) {
    	teacherService.deleteTeacher(id);
}
}
