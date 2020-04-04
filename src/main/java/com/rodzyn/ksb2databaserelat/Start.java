package com.rodzyn.ksb2databaserelat;

import com.rodzyn.ksb2databaserelat.model.*;
import com.rodzyn.ksb2databaserelat.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Start {

    @Autowired
    public Start(StudentRepo studentRepo, BackpackRepo backpackRepo,
                 NotebookRepo notebookRepo, ProfessorRepo professorRepo,
                 NoteRepo noteRepo, RoomRepo roomRepo, CleanerRepo cleanerRepo) {

        //cleaners
        Cleaner cleanerGoska = new Cleaner("Małgorzata", "Sprzątająa");
        Cleaner cleanerKryśka = new Cleaner("Krystyna", "Czyszcząca");

        // rooms
        Room roomFirst = new Room(125L);
        Room roomSecond = new Room(242L);

        //notes
        Note noteFirst = new Note("First note");
        Note noteSecond = new Note("Second note");

        //notebooks
        Notebook notebookHistory = new Notebook("History");
        Notebook notebookIt = new Notebook("It");

        // backpacks
        Backpack backpackNike = new Backpack("Nike");
        Backpack backpackRebook = new Backpack("Rebook");

        //students
        Student student1 = new Student("Karol", "Janusz", "KB");
        Student student2 = new Student("Mateusz", "Swiniarski", "KA");

        //professors
        Professor professorPh = new Professor("Kamil", "Springowski", "Ph.D.");
        Professor professorProf = new Professor("Justyna", "Bazodanowa", "Prof");


        Set<Student> studentSet = Stream.of(student1, student2).collect(Collectors.toSet());
        Set<Professor> professorSet = Stream.of(professorPh, professorProf).collect(Collectors.toSet());

        roomFirst.setCleaner(cleanerKryśka);
        roomSecond.setCleaner(cleanerGoska);
        
        cleanerRepo.save(cleanerGoska);
        cleanerRepo.save(cleanerKryśka);

        roomRepo.save(roomFirst);
        roomRepo.save(roomSecond);

        backpackRepo.save(backpackNike);
        backpackRepo.save(backpackRebook);

        notebookHistory.setBackpack(backpackNike);
        notebookIt.setBackpack(backpackNike);

        notebookRepo.save(notebookHistory);
        notebookRepo.save(notebookIt);

        noteFirst.setNotebook(notebookHistory);
        noteSecond.setNotebook(notebookHistory);

        noteRepo.save(noteFirst);
        noteRepo.save(noteSecond);

        student1.setBackpack(backpackNike);
        student2.setBackpack(backpackRebook);

        student1.setProfessorSet(professorSet);
        student2.setProfessorSet(professorSet);

        professorPh.setStudentSet(studentSet);
        professorProf.setStudentSet(studentSet);

        professorPh.setRoom(roomFirst);
        professorProf.setRoom(roomFirst);


        studentRepo.save(student1);
        studentRepo.save(student2);

        professorRepo.save(professorPh);
        professorRepo.save(professorProf);
    }
}
