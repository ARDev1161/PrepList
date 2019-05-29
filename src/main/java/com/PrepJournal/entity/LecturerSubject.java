package com.PrepJournal.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lecturer_subject")
public class LecturerSubject {
    @Id
    Integer id;

    @Column(name = "id_lecturer")
    private String id_lecturer;

    @Column(name = "id_subject")
    private String id_subject;

    public String getId_lecturer() {
        return id_lecturer;
    }

    public void setId_lecturer(String id_lecturer) {
        this.id_lecturer = id_lecturer;
    }

    public String getId_subject() {
        return id_subject;
    }

    public void setId_subject(String id_subject) {
        this.id_subject = id_subject;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "lecturer_subject")
    private Set<Subject> subjects;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "lecturer_subject")
    private Set<Lecturer> lecturers;

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Set<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(Set<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }
}
