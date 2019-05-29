package com.PrepJournal.service.ipml;

import com.PrepJournal.entity.Journal;
import com.PrepJournal.repository.JournalRepository;
import com.PrepJournal.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceIpml implements JournalService {

    @Autowired
    private JournalRepository journalRepository;

    @Override
    public Journal addJournal(Journal journal) {
        Journal savedBank =journalRepository.saveAndFlush(journal);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        journalRepository.delete(id);
    }

    @Override
    public Journal getByName(String name) {
        return journalRepository.findByName(name);
    }

    @Override
    public Journal editJournal(Journal journal) {
        return journalRepository.saveAndFlush(journal);
    }

    @Override
    public List<Journal> getAll() {
        return journalRepository.findAll();
    }
}
