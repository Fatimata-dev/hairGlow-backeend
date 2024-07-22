package com.hairglow.repository;


import com.hairglow.entity.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutineRepo extends JpaRepository<Routine, Long> {
}
