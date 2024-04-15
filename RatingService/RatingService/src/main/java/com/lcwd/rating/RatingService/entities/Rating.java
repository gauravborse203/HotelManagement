package com.lcwd.rating.RatingService.entities;

import com.lcwd.hotel.HotelService.entities.Hotel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="ratings")
@Entity
public class Rating {
	
	  @Id
      private String ratingId;
      private String userId;
      private String hotelId;
      private int rating;
      private String feedback;
      
     // private Hotel hotel;
}
