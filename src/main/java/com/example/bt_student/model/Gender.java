package com.example.bt_student.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String gender;
    @OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Student> students;

}
