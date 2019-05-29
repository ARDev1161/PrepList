package com.PrepJournal.repository;

import com.PrepJournal.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
public interface JournalRepository extends JpaRepository<Journal, Long> {
    Journal findByName(String name);
}
