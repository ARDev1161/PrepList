package com.PrepJournal.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "module")
public class Module {
    @Id
    Integer id;

    @Column(name = "begin")
    private String begin;

    @Column(name = "end")
    private String end;


    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "module")
    private Set<Journal> journal;

    public Set<Journal> getJournal() {
        return journal;
    }

    public void setJournal(Set<Journal> journal) {
        this.journal = journal;
    }
}
