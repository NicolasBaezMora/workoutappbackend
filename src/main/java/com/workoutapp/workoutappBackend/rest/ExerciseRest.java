package com.workoutapp.workoutappBackend.rest;


import com.workoutapp.workoutappBackend.daos.ExerciseDao;
import com.workoutapp.workoutappBackend.entities.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/exercise")
public class ExerciseRest {

    @Autowired
    private ExerciseDao exerciseDao;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Exercise>> getExercises(){
        List<Exercise> exercises = exerciseDao.findAll();
        return ResponseEntity.ok(exercises);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Exercise> getExerciseById(@PathVariable(value = "id") Long idExercise) {
        Exercise exerciseItem = exerciseDao.findById(idExercise)
                .orElseThrow(() -> new RuntimeException("Exercise not found"));
        return ResponseEntity.ok(exerciseItem);
    }

}

















