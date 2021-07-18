package com.lessmann.betina.teacherbetina.mappers;

import com.lessmann.betina.teacherbetina.dtos.get.TeacherGet;
import com.lessmann.betina.teacherbetina.dtos.post.TeacherPost;
import com.lessmann.betina.teacherbetina.dtos.put.TeacherPut;
import com.lessmann.betina.teacherbetina.entities.Teacher;
import com.lessmann.betina.teacherbetina.standard.StandardMapperInterface;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class TeacherMapper implements StandardMapperInterface<Teacher, TeacherGet, TeacherPost, TeacherPut> {
    public static final TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);
}