package com.devansh.TrainBooking.dao;

import com.devansh.TrainBooking.model.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<TrainDetails,Integer> {
}
