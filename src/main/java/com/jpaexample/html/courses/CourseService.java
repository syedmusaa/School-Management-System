package com.jpaexample.html.courses;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepo StudentRepository;
    
    public void run(String... args) throws Exception {
        // Insert customers
    
    	StudentRepository.insert(new Course(1, "Biology", "Human Cells"));}
    
    	public List<Course> getAllCourses() {
            return StudentRepository.getAllCourses();
        }

        public Course getCourseById(long id) {
            return StudentRepository.getCourseById(id);
        }

        public void saveCourse(Course student) {
        	StudentRepository.saveCourse(student);
        }

        public void updateCourse(Course student) {
        	StudentRepository.updateCourse(student);
        }

        public void deleteCourse(long id) {
        	StudentRepository.deleteCourse(id);
        }
    }