package com.codeclan.example.paintzServer.controllers;


import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaintController {

    @Autowired
    PaintRepository paintRepository;

    @GetMapping(value = "/paints")
    public ResponseEntity<List<Paint>> getAllPaints() {
        return new ResponseEntity<>(paintRepository.findAll(), HttpStatus.OK);
    }
}
