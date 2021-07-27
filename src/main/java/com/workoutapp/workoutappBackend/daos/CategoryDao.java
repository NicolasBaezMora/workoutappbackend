package com.workoutapp.workoutappBackend.daos;

import com.workoutapp.workoutappBackend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long> {

}
