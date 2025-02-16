package com.clientGuideline.demo.controller;

import com.clientGuideline.demo.model.ClientGuideline;
import com.clientGuideline.demo.repository.ClientGuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientGuidelineController {

    @Autowired
    private ClientGuidelineRepository repository;

    @GetMapping("/guideline")
    public List<ClientGuideline> getGuidelines(@RequestParam(name = "customerID") Long customerId, @RequestParam(name = "serviceID") Long serviceId) {
        return repository.findByServiceIdAndCustomerId(serviceId, customerId);
    }
}
