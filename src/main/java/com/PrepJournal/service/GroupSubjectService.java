package com.PrepJournal.service;

import com.PrepJournal.entity.GroupSubject;

import java.util.List;

public interface GroupSubjectService {
    GroupSubject addGroupSubject(GroupSubject groupSubject);
    void delete(long id);
    GroupSubject getByName(String name);
    GroupSubject editGroupSubject(GroupSubject groupSubject);
    List<GroupSubject> getAll();
}
