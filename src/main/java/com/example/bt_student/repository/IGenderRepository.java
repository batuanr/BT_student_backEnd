package com.example.bt_student.repository;

import com.example.bt_student.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenderRepository extends JpaRepository<Gender, Long> {
}
