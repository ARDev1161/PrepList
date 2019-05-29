package com.PrepJournal.service;

import com.PrepJournal.entity.LecturerSubject;

import java.util.List;

public interface LecturerSubjectService {
    LecturerSubject addLecturerSubject(LecturerSubject lecturerSubject);
    void delete(long id);
    LecturerSubject getByName(String name);
    LecturerSubject editLecturerSubject(LecturerSubject lecturerSubject);
    List<LecturerSubject> getAll();
}
