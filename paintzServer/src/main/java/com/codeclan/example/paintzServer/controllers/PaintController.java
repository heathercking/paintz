package com.codeclan.example.paintzServer.controllers;


import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaintController {

    @Autowired
    PaintRepository paintRepository;

    @GetMapping(value = "/paints", produces = "application/json")
    public ResponseEntity<List<Paint>> getPaints(
            @RequestParam(name="hex", required = false) String hexValue,
            @RequestParam(name="number", required = false) String number,
            @RequestParam(name="manufacturer", required = false) String manufacturer,
            @RequestParam(name="name", required = false) String name
            ) {
        if (hexValue != null) {
            return new ResponseEntity<>(paintRepository.findPaintsByHexValue(hexValue), HttpStatus.OK);
        } else if (number != null) {
            return new ResponseEntity<>(paintRepository.findPaintsByPaintNum(number), HttpStatus.OK);
        } else if (manufacturer != null) {
            return new ResponseEntity<>(paintRepository.findPaintsByManufacturer(ManufacturerType.valueOf(manufacturer.toUpperCase())), HttpStatus.OK);
        } else if (name != null) {
            return new ResponseEntity<>(paintRepository.findPaintsByNameContaining(name), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(paintRepository.findAll(), HttpStatus.OK);
        }

    }

    @GetMapping(value = "paints/converter")
    public ResponseEntity<List<Paint>> getConvertedPaints(
            @RequestParam(name="number", required = true) String number,
            @RequestParam(name="manufacturer", required = true) String manufacturer
    ) {
        if (number != null && manufacturer != null) {
            String upperManufacturer = manufacturer.toUpperCase();
            Paint found = paintRepository.findPaintByPaintNumAndManufacturer(number, ManufacturerType.valueOf(upperManufacturer));
            String hexValue = found.getHexValue();
            return new ResponseEntity<List<Paint>>(paintRepository.findPaintsByHexValue(hexValue), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(paintRepository.findAll(), HttpStatus.OK);
        }
    }

    @GetMapping(value = "paints/converter/equivalents")
    public ResponseEntity<List<Paint>> getClosestMatches(
            @RequestParam(name="number", required = true) String number,
            @RequestParam(name="manufacturer", required = true) String manufacturer
    ) {
        if (number != null && manufacturer != null) {
            String upperManufacturer = manufacturer.toUpperCase();
            Paint found = paintRepository.findPaintByPaintNumAndManufacturer(number, ManufacturerType.valueOf(upperManufacturer));
            return new ResponseEntity<List<Paint>>(found.findClosestMatches(paintRepository.findAll()), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(paintRepository.findAll(), HttpStatus.OK);
        }
    }



}
