package com.PrepJournal.service.ipml;

import com.PrepJournal.entity.GroupSubject;
import com.PrepJournal.repository.GroupSubjectRepository;
import com.PrepJournal.service.GroupSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupSubjectIpml implements GroupSubjectService {

    @Autowired
    private GroupSubjectRepository groupSubjectRepository;

    @Override
    public GroupSubject addGroupSubject(GroupSubject groupSubject) {
        GroupSubject savedBank = groupSubjectRepository.saveAndFlush(groupSubject);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        groupSubjectRepository.delete(id);
    }

    @Override
    public GroupSubject getByName(String name) {
        return groupSubjectRepository.findByName(name);
    }

    @Override
    public GroupSubject editGroupSubject(GroupSubject groupSubject) {
        return groupSubjectRepository.saveAndFlush(groupSubject);
    }

    @Override
    public List<GroupSubject> getAll() {
        return groupSubjectRepository.findAll();
    }

}
