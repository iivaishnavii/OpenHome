package com.cmpe275.OpenHome.service;

import com.cmpe275.OpenHome.model.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> list();
    Reservation save(Reservation reservation) throws Exception;
    Reservation cancelReservation(int id) throws Exception;
    void noShowcancelReservation(int id) throws Exception;
    void handleCancellations();
    Reservation checkIn(int id) throws Exception;
    Reservation checkOut(int id) throws Exception;

    List<Reservation> getReservationsById(String email) throws Exception;
    Reservation updateUserRating(String review, int rating,int id) throws Exception;
    Reservation updatePostingRating(String review, int rating,int id) throws Exception;

    void autoCheckouts() throws Exception;

    List<Reservation> getReservationsByHostId(String email)throws Exception;
}
