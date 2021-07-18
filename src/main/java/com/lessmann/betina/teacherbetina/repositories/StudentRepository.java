package com.lessmann.betina.teacherbetina.repositories;

import com.lessmann.betina.teacherbetina.entities.Student;
import com.lessmann.betina.teacherbetina.repositories.dao.StudentDAO;
import com.lessmann.betina.teacherbetina.standard.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends StandardRepository<Student, StudentDAO> {

    @Autowired
    public StudentRepository(StudentDAO dao){
        this.dao = dao;
    }

}
