package com.lcwd.rating.RatingService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.RatingService.entities.Rating;

public interface RatingRepository  extends JpaRepository<Rating,String>{

	
	
	//customer finder method 
	List<Rating>findByUserId( String userId);
    List<Rating>findByHotelId(String hotelId);
}
