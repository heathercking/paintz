package com.codeclan.example.paintzServer.controllers;


import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaintController {

    @Autowired
    PaintRepository paintRepository;

    @GetMapping(value = "/paints")
    public ResponseEntity<List<Paint>> getPaints(
            @RequestParam(name="hex", required = false) String hexValue,
            @RequestParam(name="number", required = false) String number,
            @RequestParam(name="manufacturer", required = false) String manufacturer
            ) {
        if (hexValue != null) {
            return new ResponseEntity<>(paintRepository.findPaintsByHexValue(hexValue), HttpStatus.OK);
        } else if (number != null) {
            return new ResponseEntity<>(paintRepository.findPaintsByPaintNum(number), HttpStatus.OK);
        } else if (manufacturer != null) {
            return new ResponseEntity<>(paintRepository.findPaintsByManufacturer(ManufacturerType.valueOf(manufacturer.toUpperCase())), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(paintRepository.findAll(), HttpStatus.OK);
        }

    }



}
