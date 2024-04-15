package com.lcwd.rating.RatingService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {
    
	@Autowired
	private  RatingRepository repository;
	
	
	
//	@Override
//	public Rating create(Rating rating) {
//		
//		
//		String ratingId=UUID.randomUUID().toString();		
//		rating.setId(ratingId); 
//		// TODO Auto-generated method stub
//		return repository.save(rating);
//	}
	
	
	
	
	
	@Override
	public Rating create(Rating rating) {
	   String  ratingId = UUID.randomUUID().toString(); // Generating a random UUID
	    rating.setRatingId(ratingId);
	    return repository.save(rating);
	}


	@Override
	public List<Rating> getRatings() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	//get all by userId
	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return repository.findByUserId(userId);
	}

	    //get all by hotelId
	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return repository.findByHotelId(hotelId);
	}

}
