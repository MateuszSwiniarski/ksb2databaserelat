package com.rodzyn.ksb2databaserelat.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long roomNumber;

    @OneToMany(mappedBy = "room")
    private Set<Professor> professorSet;
    @ManyToOne
    private Cleaner cleaner;

    public Room() {
    }

    public Room(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    public Set<Professor> getProfessorSet() {
        return professorSet;
    }

    public void setProfessorSet(Set<Professor> professorSet) {
        this.professorSet = professorSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }
}
