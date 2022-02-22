package com.mehmet.teachers.service;

import com.mehmet.teachers.model.TeacherModelDTO;
import com.mehmet.teachers.repository.TeacherCrudOperation;
import com.mehmet.teachers.repository.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherCrudOperation teacherCrudOperation;

    public String insertTeacher(String name, String surname,
                                         String department, String feature){

        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setName(name);
        teacherEntity.setSurname(surname);
        teacherEntity.setDepartment(department);
        teacherEntity.setFeature(feature);

        teacherCrudOperation.save(teacherEntity);
        return "teacherEntity";

    }
}
