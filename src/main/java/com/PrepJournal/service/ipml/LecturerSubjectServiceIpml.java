package com.PrepJournal.service.ipml;

import com.PrepJournal.entity.LecturerSubject;
import com.PrepJournal.repository.LecturerSubjectRepository;
import com.PrepJournal.service.LecturerSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerSubjectServiceIpml implements LecturerSubjectService {

    @Autowired
    private LecturerSubjectRepository lecturerSubjectRepository;

    @Override
    public LecturerSubject addLecturerSubject(LecturerSubject lecturerSubject) {
        LecturerSubject savedBank =lecturerSubjectRepository.saveAndFlush(lecturerSubject);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        lecturerSubjectRepository.delete(id);
    }

    @Override
    public LecturerSubject getByName(String name) {
        return lecturerSubjectRepository.findByName(name);
    }

    @Override
    public LecturerSubject editLecturerSubject(LecturerSubject lecturerSubject) {
        return lecturerSubjectRepository.saveAndFlush(lecturerSubject);
    }

    @Override
    public List<LecturerSubject> getAll() {
        return lecturerSubjectRepository.findAll();
    }
}
