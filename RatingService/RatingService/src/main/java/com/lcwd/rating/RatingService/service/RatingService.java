package com.lcwd.rating.RatingService.service;

import java.util.List;

import com.lcwd.rating.RatingService.entities.Rating;

public interface RatingService {
   
	
	//create 
	Rating create(Rating rating);
	
	
	//get all 
	List<Rating>getRatings();
	
	
	//get all by userId
	List<Rating>getRatingByUserId(String userId);
	
	
	
	//get all by hotelId
	List<Rating> getRatingByHotelId(String hotelId);
}
