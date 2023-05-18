package com.devansh.TrainBooking.controller;

import com.devansh.TrainBooking.model.TrainBook;
import com.devansh.TrainBooking.model.TrainDetails;
import com.devansh.TrainBooking.service.TrainBookServiceImpl;
import com.devansh.TrainBooking.service.TrainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noauth")
public class UserController {

    @Autowired
    private TrainBookServiceImpl trainBookService;

    @PostMapping("/ticket")
    public String bookTicket(@RequestBody() TrainBook book){
        return trainBookService.bookticket(book);
    }

    @GetMapping("/ticket")
    public List<TrainBook> getTicket(){
        return trainBookService.showMyticket();
    }

    @DeleteMapping("/ticket")
    public String cancelTicket(@RequestParam("id") Integer id){
        return trainBookService.cancelTicket(id);
    }


}
