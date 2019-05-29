package com.PrepJournal.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "group")
public class Group {
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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "group")
    private Set<GroupSubject> groupSubjects;

    public Set<GroupSubject> getGroupSubjects() {
        return groupSubjects;
    }

    public void setGroupSubjects(Set<GroupSubject> groupSubjects) {
        this.groupSubjects = groupSubjects;
    }
}
