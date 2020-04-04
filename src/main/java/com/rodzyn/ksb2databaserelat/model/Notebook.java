package com.rodzyn.ksb2databaserelat.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "notebooks")
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToOne
    private Backpack backpack;
    @OneToMany(mappedBy = "notebook")
    private Set<Note> noteSet;

    public Notebook() {
    }

    public Notebook(String title) {
        this.title = title;
    }

    public Set<Note> getNoteSet() {
        return noteSet;
    }

    public void setNoteSet(Set<Note> noteSet) {
        this.noteSet = noteSet;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
