package com.lessmann.betina.TeacherBetina.mappers;

import com.lessmann.betina.TeacherBetina.dtos.get.ScheduleGet;
import com.lessmann.betina.TeacherBetina.dtos.post.SchedulePost;
import com.lessmann.betina.TeacherBetina.dtos.put.SchedulePut;
import com.lessmann.betina.TeacherBetina.entities.Schedule;
import com.lessmann.betina.TeacherBetina.standard.StandardMapperInterface;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ScheduleMapper implements StandardMapperInterface<Schedule, ScheduleGet, SchedulePost, SchedulePut> {
    public static final ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);
}