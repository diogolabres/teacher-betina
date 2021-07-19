package com.lessmann.betina.TeacherBetina.mappers;

import com.lessmann.betina.TeacherBetina.dtos.get.StudentGet;
import com.lessmann.betina.TeacherBetina.dtos.post.StudentPost;
import com.lessmann.betina.TeacherBetina.dtos.put.StudentPut;
import com.lessmann.betina.TeacherBetina.entities.Student;
import com.lessmann.betina.TeacherBetina.standard.StandardMapperInterface;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class StudentMapper implements StandardMapperInterface<Student, StudentGet, StudentPost, StudentPut> {
    public static final StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
}