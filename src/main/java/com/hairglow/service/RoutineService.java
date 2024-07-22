package com.hairglow.service;

import com.hairglow.entity.Routine;
import com.hairglow.repository.RoutineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutineService {

    @Autowired
    private RoutineRepo routineRepository;

    @Autowired
    private RoutineRepo routineRepo;

    public List<Routine> getAllRoutines() {
        return routineRepository.findAll();
    }

}
