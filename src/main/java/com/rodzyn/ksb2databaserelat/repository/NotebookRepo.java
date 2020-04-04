package com.rodzyn.ksb2databaserelat.repository;

import com.rodzyn.ksb2databaserelat.model.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepo extends JpaRepository<Notebook, Long> {
}
