package com.rodzyn.ksb2databaserelat.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String GroupNumber;
    @ManyToMany(mappedBy = "studentSet")
    private Set<Professor> professorSet;
    @OneToOne
    private Backpack backpack;

    public Student(String name, String surname, String groupNumber) {
        this.name = name;
        this.surname = surname;
        GroupNumber = groupNumber;
    }

    public Student() {
    }

    public Set<Professor> getProfessorSet() {
        return professorSet;
    }

    public void setProfessorSet(Set<Professor> professorSet) {
        this.professorSet = professorSet;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroupNumber() {
        return GroupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        GroupNumber = groupNumber;
    }
}
