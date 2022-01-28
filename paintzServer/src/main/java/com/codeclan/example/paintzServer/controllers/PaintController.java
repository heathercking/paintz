package com.codeclan.example.paintzServer.controllers;

import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.paint.Paint;
import com.codeclan.example.paintzServer.models.user.User;
import com.codeclan.example.paintzServer.repositories.PaintRepository;
import com.codeclan.example.paintzServer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PaintController {

    @Autowired
    PaintRepository paintRepository;

    @Autowired
    UserRepository userRepository;

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

    @GetMapping(value = "/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/admin")
    public String admin() {
        return "this is the test ADMIN API";
    }



}
