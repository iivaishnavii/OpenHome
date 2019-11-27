package com.cmpe275.OpenHome.controller;

import com.cmpe275.OpenHome.model.Postings;
import com.cmpe275.OpenHome.service.PostingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostingsController {

    @Autowired
    private PostingsService postingsService;

    @GetMapping("/postings")
    public ResponseEntity<List<Postings>> getPostings() {
        System.out.println("In getMapping of Postings");
        List<Postings> postings = postingsService.list();
        return ResponseEntity.ok().body(postings);
    }

    @PostMapping("/posting")
    public ResponseEntity<?> save(@RequestBody Postings postings) {
        long id = postingsService.save(postings);
        return ResponseEntity.ok().body("New Posting has been saved with ID:" + id);
    }

}