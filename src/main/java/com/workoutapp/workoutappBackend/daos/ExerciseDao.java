package com.workoutapp.workoutappBackend.daos;

import com.workoutapp.workoutappBackend.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseDao extends JpaRepository<Exercise, Long> {
}
