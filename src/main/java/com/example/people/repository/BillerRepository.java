package com.example.people.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.people.model.Biller;

@Repository("billerRepository")
public interface BillerRepository extends JpaRepository<Biller, Long> {
	
	
	@Query("SELECT b FROM Biller b WHERE b.billerName LIKE %:billerName%")
    public List<Biller> findByName(@Param("billerName") String billerName);
}
