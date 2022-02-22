package com.mehmet.teachers.repository;

import org.springframework.data.repository.CrudRepository;

public interface TeacherCrudOperation extends CrudRepository<TeacherEntity, Integer> {
}
