package com.PrepJournal.repository;

import com.PrepJournal.entity.LecturerSubject;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LecturerSubjectRepository extends JpaRepository<LecturerSubject, Long>{
    LecturerSubject findByName(String name);
}
