package com.example.people.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.people.model.Biller;
import com.example.people.service.BillerService;

@RestController
public class BillerController {
	
	@Autowired
	private BillerService billerService;
	
    @RequestMapping(value = "/biller", method = RequestMethod.GET, produces = {"application/xml"})
    public List<Biller> getBillers() {
		return billerService.getAllBillers();
	}

    @RequestMapping(value = "/biller/{id}", method = RequestMethod.GET)
    public Optional<Biller> getBiller(@PathVariable("id") long id) {
		return billerService.getBillerById(id);
	}
    
    @RequestMapping(value = "/billerName/{name}", method = RequestMethod.GET)
    public List<Biller> getBiller(@PathVariable("name") String name) {
		return billerService.getBillersByBillerName(name);
	}
    
}