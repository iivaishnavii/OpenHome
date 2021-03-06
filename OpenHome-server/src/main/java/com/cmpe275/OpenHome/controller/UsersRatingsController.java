package com.cmpe275.OpenHome.controller;

import com.cmpe275.OpenHome.model.PostingsratingsEntity;
import com.cmpe275.OpenHome.model.UsersRatingsEntity;
import com.cmpe275.OpenHome.DataObjects.UserRatingForm;
import com.cmpe275.OpenHome.service.PostingsRatingsService;
import com.cmpe275.OpenHome.service.ReservationService;
import com.cmpe275.OpenHome.service.UsersRatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UsersRatingsController {


    @Autowired
    private UsersRatingsService usersRatingsService;

    @Autowired
    private ReservationService reservationService;

    @CrossOrigin
    @PostMapping("/userRating")
    public ResponseEntity<?> saveRating(@RequestBody UsersRatingsEntity userRate) {
        System.out.println(userRate.toString());



        try {
            reservationService.updateUserRating(userRate.getReview(), userRate.getRating(), userRate.getBookingId());
            usersRatingsService.saveRating(userRate);
            return ResponseEntity.ok().body("Your rating has been saved");
        }
        catch(Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());

        }
    }


    @CrossOrigin
    @PostMapping("/particularUserRating")
    public ResponseEntity<?> getAverageRatingOfAUser(@RequestBody UserRatingForm userRating) {
        System.out.println("In getAverageRatingOfAUser in UserRatingsController");
        System.out.println("userId:"+userRating.getUserId());
        double avgRating = usersRatingsService.getAverageRatingForUser(userRating.getUserId());
        System.out.println("The rating in controller recived is "+avgRating);
        Map<String,Double> map = new HashMap<>();
        map.put("AvgRating",avgRating);

        return  ResponseEntity.ok().body(map);
    }
}
