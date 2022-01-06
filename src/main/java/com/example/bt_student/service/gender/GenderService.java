package com.example.bt_student.service.gender;

import com.example.bt_student.model.Gender;
import com.example.bt_student.repository.IGenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class GenderService implements IGenderService{
    @Autowired
    IGenderRepository genderRepository;
    @Override
    public Iterable<Gender> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public Optional<Gender> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Gender gender) {

    }

    @Override
    public void remove(Long id) {

    }
}
