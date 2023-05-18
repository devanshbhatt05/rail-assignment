package com.devansh.TrainBooking.dao;

import com.devansh.TrainBooking.model.TrainBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<TrainBook,Integer> {
}
