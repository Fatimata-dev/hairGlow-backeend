package com.hairglow.repository;

import com.hairglow.entity.HairJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepo extends JpaRepository<HairJournal, Long> {
}
