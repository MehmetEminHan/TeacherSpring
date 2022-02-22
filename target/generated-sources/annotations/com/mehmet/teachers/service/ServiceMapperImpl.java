package com.mehmet.teachers.service;

import com.mehmet.teachers.model.TeacherModelDTO;
import com.mehmet.teachers.repository.TeacherEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-21T21:40:16-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public TeacherModelDTO mapEntityToDTO(TeacherEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TeacherModelDTO teacherModelDTO = new TeacherModelDTO();

        teacherModelDTO.setId( entity.getId() );
        teacherModelDTO.setName( entity.getName() );
        teacherModelDTO.setSurname( entity.getSurname() );
        teacherModelDTO.setDepartment( entity.getDepartment() );
        teacherModelDTO.setFeature( entity.getFeature() );

        return teacherModelDTO;
    }
}
