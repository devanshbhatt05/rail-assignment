package com.devansh.TrainBooking.service;

import com.devansh.TrainBooking.model.TrainBook;

import java.util.List;

public interface TrainBookService {

    String bookticket(TrainBook book);

    List<TrainBook> showMyticket();

    String cancelTicket(Integer id);

}
