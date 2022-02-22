package com.mehmet.teachers.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeacherModelDTO {

    private Integer id;
    private String name;
    private String surname;
    private String department;
    private String feature;

}
