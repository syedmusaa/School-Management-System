package com.jpaexample.teachers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo TeacherRepository;
    
    public void run(String... args) throws Exception {
        // Insert customers
    
    	TeacherRepository.insert(new Teacher(1, "Vikram Chauhan", 33, "vikram.chauhan@example.com", 706715875, "Human Anatomy"));}
    
    	public List<Teacher> getAllTeachers() {
            return TeacherRepository.getAllTeachers();
        }

        public Teacher getTeacherById(long id) {
            return TeacherRepository.getTeacherById(id);
        }

        public void saveTeacher(Teacher teacher) {
        	TeacherRepository.saveTeacher(teacher);
        }

        public void updateTeacher(Teacher teacher) {
        	TeacherRepository.updateTeacher(teacher);
        }

        public void deleteTeacher(long id) {
        	TeacherRepository.deleteTeacher(id);
        }
    }