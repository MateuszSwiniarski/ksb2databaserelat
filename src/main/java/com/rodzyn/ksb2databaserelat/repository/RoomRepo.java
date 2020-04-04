package com.rodzyn.ksb2databaserelat.repository;

import com.rodzyn.ksb2databaserelat.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {
}
