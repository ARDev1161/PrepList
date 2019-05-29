package com.PrepJournal.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    Integer id;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "subject")
    private Set<Journal> journal;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "subject")
    private Set<LecturerSubject> lecturerSubjects;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "subject")
    private Set<GroupSubject> groupSubjects;

    public Set<Journal> getJournal() {
        return journal;
    }

    public void setJournal(Set<Journal> journal) {
        this.journal = journal;
    }

    public Set<LecturerSubject> getLecturerSubjects() {
        return lecturerSubjects;
    }

    public void setLecturerSubjects(Set<LecturerSubject> lecturerSubjects) {
        this.lecturerSubjects = lecturerSubjects;
    }

    public Set<GroupSubject> getGroupSubjects() {
        return groupSubjects;
    }

    public void setGroupSubjects(Set<GroupSubject> groupSubjects) {
        this.groupSubjects = groupSubjects;
    }
}
