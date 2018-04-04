package com.example.people.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.people.model.Biller;
import com.example.people.repository.BillerRepository;

@Service("billerService")
public class BillerServiceImpl implements BillerService {
	
	@Autowired
	BillerRepository billerRepository; 

	@Override
	public List<Biller> getAllBillers() {
		return billerRepository.findAll();
	}

	@Override
	public Optional<Biller> getBillerById(long id) {
		return billerRepository.findById(id);
	}

	@Override
	public List<Biller> getBillersByBillerName(String billerName) {
		return billerRepository.findByName(billerName);
	}

}
