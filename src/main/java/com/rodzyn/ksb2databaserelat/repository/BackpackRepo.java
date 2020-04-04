package com.rodzyn.ksb2databaserelat.repository;

import com.rodzyn.ksb2databaserelat.model.Backpack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackpackRepo extends JpaRepository<Backpack, Long> {
}
