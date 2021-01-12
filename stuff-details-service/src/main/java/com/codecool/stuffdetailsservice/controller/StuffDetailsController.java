package com.codecool.stuffdetailsservice.controller;

import com.codecool.stuffdetailsservice.entity.StuffDetails;
import com.codecool.stuffdetailsservice.service.StuffDetailsProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/detail")
public class StuffDetailsController {

    @Autowired
    private StuffDetailsProvider stuffDetailsProvider;

    @GetMapping("/{stuff_id}")
    public StuffDetails getStuffDetailsByStuffId(@PathVariable("stuff_id") Long stuffId) {
        return stuffDetailsProvider.getStuffDetailsByStuffId(stuffId);
    }

}