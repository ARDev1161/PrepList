package com.PrepJournal.repository;

import com.PrepJournal.entity.GroupSubject;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GroupSubjectRepository  extends JpaRepository<GroupSubject, Long> {
    GroupSubject findByName(String name);
}
