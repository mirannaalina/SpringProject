package com.Stud.Service;

import com.Stud.Dao.StudentDao;
import com.Stud.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }
    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }
    public void removeStudentById(int id){
        this.studentDao.removeStudentById(id);
    }
    public void updateStudent(Student student){
     this.studentDao.updateStudent(student);
    }
    public void insertStudent(Student student){
        this.studentDao.insertStudentToDb(student);
    }

}
