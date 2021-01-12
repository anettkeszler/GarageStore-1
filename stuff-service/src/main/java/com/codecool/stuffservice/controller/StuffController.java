package com.codecool.stuffservice.controller;

import com.codecool.stuffservice.entity.Stuff;
import com.codecool.stuffservice.model.StuffDetailsResult;
import com.codecool.stuffservice.model.StuffWithDetails;
import com.codecool.stuffservice.service.StuffDetailsServiceCaller;
import com.codecool.stuffservice.service.StuffProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/stuff")
public class StuffController {

    @Autowired
    private StuffProvider stuffProvider;


    @GetMapping("/all")
    public List<Stuff> getAllStuff() {
        return stuffProvider.getAllStuff();
    }

    @GetMapping("/{stuff_id}")
    public StuffWithDetails getStuffWithDetailsByStuffId(@PathVariable("stuff_id") Long stuffId) {
        return stuffProvider.getStuffWithDetailsByStuffId(stuffId);
    }
}
