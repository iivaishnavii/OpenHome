package com.cmpe275.OpenHome.controller;

import com.cmpe275.OpenHome.model.Reservation;
import com.cmpe275.OpenHome.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")

public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public ResponseEntity<List<Reservation>> getReservations() {

        List<Reservation> reservations = reservationService.list();
        return ResponseEntity.ok().body(reservations);
    }

    @PostMapping("/reservation")
    public ResponseEntity<?> makeReservation(@RequestBody Reservation reservation) {


        try {
            Reservation reser = reservationService.save(reservation);
            return ResponseEntity.ok().body("New reservation has been saved with ID:" + reser);
        }

        catch (Exception e) {
            return ResponseEntity.ok().body(e.getMessage());

        }


    }


    @DeleteMapping("/reservation")
    public ResponseEntity<?> cancel(@RequestBody int id) {

        long deletedId = reservationService.cancelReservation(id);


        return ResponseEntity.ok().body("Reservation cancelled:" + deletedId);
    }

}