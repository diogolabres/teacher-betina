package com.lessmann.betina.TeacherBetina.repositories;

import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.repositories.dao.StudentDAO;
import com.lessmann.betina.TeacherBetina.standard.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends StandardRepository<Student, StudentDAO> {

    @Autowired
    public StudentRepository(StudentDAO dao){
        this.dao = dao;
    }

}
