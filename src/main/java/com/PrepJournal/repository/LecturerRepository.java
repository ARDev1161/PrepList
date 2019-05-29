package com.PrepJournal.repository;

import com.PrepJournal.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LecturerRepository extends JpaRepository<Lecturer, Long> {
}
