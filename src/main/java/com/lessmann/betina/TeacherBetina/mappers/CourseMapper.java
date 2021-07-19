package com.lessmann.betina.TeacherBetina.mappers;

import com.lessmann.betina.TeacherBetina.dtos.get.CourseGet;
import com.lessmann.betina.TeacherBetina.dtos.post.CoursePost;
import com.lessmann.betina.TeacherBetina.dtos.put.CoursePut;
import com.lessmann.betina.TeacherBetina.entities.Course;
import com.lessmann.betina.TeacherBetina.standard.StandardMapperInterface;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CourseMapper implements StandardMapperInterface<Course, CourseGet, CoursePost, CoursePut> {
    public static final CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);
}