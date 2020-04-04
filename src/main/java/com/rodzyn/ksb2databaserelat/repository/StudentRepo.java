package com.rodzyn.ksb2databaserelat.repository;

import com.rodzyn.ksb2databaserelat.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
