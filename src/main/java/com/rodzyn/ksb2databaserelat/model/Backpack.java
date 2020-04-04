package com.rodzyn.ksb2databaserelat.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "backpacks")
public class Backpack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;

    @OneToMany(mappedBy = "backpack")
    private Set<Notebook> notebookSet;

    public Backpack() {
    }

    public Backpack(String mark) {
        this.mark = mark;
    }

    public Set<Notebook> getNotebookSet() {
        return notebookSet;
    }

    public void setNotebookSet(Set<Notebook> notebookSet) {
        this.notebookSet = notebookSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        mark = mark;
    }
}
