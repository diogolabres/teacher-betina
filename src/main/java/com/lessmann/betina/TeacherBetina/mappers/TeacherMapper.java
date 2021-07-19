package com.lessmann.betina.TeacherBetina.mappers;

import com.lessmann.betina.TeacherBetina.dtos.get.TeacherGet;
import com.lessmann.betina.TeacherBetina.dtos.post.TeacherPost;
import com.lessmann.betina.TeacherBetina.dtos.put.TeacherPut;
import com.lessmann.betina.TeacherBetina.entities.Teacher;
import com.lessmann.betina.TeacherBetina.standard.StandardMapperInterface;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class TeacherMapper implements StandardMapperInterface<Teacher, TeacherGet, TeacherPost, TeacherPut> {
    public static final TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);
}