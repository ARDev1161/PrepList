package com.PrepJournal.repository;

import com.PrepJournal.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GroupRepository  extends JpaRepository<Group, Long> {
}
