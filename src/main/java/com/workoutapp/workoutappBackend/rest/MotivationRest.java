package com.workoutapp.workoutappBackend.rest;


import com.workoutapp.workoutappBackend.daos.MotivationDao;
import com.workoutapp.workoutappBackend.entities.Motivation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/motivation")
public class MotivationRest {

    @Autowired
    private MotivationDao motivationDao;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Motivation>> getMotivations(){
        List<Motivation> motivations = motivationDao.findAll();
        return ResponseEntity.ok(motivations);
    }

}
