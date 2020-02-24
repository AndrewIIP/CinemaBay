package com.andrew.cinema.repo;

import com.andrew.cinema.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {

}
