package com.PrepJournal.service;
import  com.PrepJournal.entity.Journal;
import java.util.List;
public interface JournalService {
    Journal addJournal(Journal journal);
    void delete(long id);
    Journal getByName(String name);
    Journal editJournal(Journal journal);
    List<Journal> getAll();
}
