package com.workoutapp.workoutappBackend.daos;

import com.workoutapp.workoutappBackend.entities.Motivation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotivationDao extends JpaRepository<Motivation, Long> {
}
