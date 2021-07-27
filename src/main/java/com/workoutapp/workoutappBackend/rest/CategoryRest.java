package com.workoutapp.workoutappBackend.rest;

import com.workoutapp.workoutappBackend.daos.CategoryDao;
import com.workoutapp.workoutappBackend.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryRest {

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getCategories(){
        List<Category> categories = categoryDao.findAll();
        return ResponseEntity.ok(categories);
    }

}
