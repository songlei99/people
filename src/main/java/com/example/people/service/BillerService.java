package com.example.people.service;

import java.util.List;
import java.util.Optional;

import com.example.people.model.Biller;

public interface BillerService {
	Optional<Biller> getBillerById(long id);
	List<Biller> getBillersByBillerName(String billerName);
	List<Biller> getAllBillers();
}
