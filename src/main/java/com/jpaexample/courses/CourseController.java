package com.jpaexample.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
    private CourseService courseService;

    // Get all students
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable long id) {
        return courseService.getCourseById(id);
    }

    // Create a new student
    @PostMapping ("/registration")
    public void saveCourse(@RequestBody Course course) {
    	courseService.saveCourse(course);
    }

    // Update an existing student
    @PutMapping("/update/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
    	course.setId(id);
    	courseService.updateCourse(course);
    }

    // Delete a student by ID
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable long id) {
    	courseService.deleteCourse(id);
}
}
