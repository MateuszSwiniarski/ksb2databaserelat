package com.rodzyn.ksb2databaserelat.repository;

import com.rodzyn.ksb2databaserelat.model.Cleaner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerRepo extends JpaRepository<Cleaner, Long> {
}
