package com.hairglow.controller;

import com.hairglow.entity.Routine;
import com.hairglow.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routine")
public class RoutineController {

    @Autowired
    private RoutineService routineService;

    @GetMapping
    public List<Routine> getAllRoutines() {
        return routineService.getAllRoutines();
    }

//    @PostMapping
//    public Routine generateRoutine(@RequestBody UserHair profile) {
//        return routineService.generateRoutine(profile);
//    }
}
