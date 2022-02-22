package com.mehmet.teachers.service;

import com.mehmet.teachers.model.TeacherModelDTO;
import com.mehmet.teachers.repository.TeacherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ServiceMapper {

    //EZBER - Çağırabilmek için
    ServiceMapper INSTANCE = Mappers.getMapper(ServiceMapper.class);

    TeacherModelDTO mapEntityToDTO(TeacherEntity entity);

}
