package com.lcwd.hotel.HotelService.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.HotelService.entities.Hotel;
import com.lcwd.hotel.HotelService.exception.ResourceNotFoundException;
import com.lcwd.hotel.HotelService.repositories.HotelRepository;


@Service
public class HotelServiceImpl  implements  HotelService {
     
@Autowired	
private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		
		String hotelId=UUID.randomUUID().toString();		
	hotel.setId(hotelId); 
		
		return hotelRepository.save(hotel);	}
	
//	private  HotelRepository hotelRepository;
//
//    public HotelServiceImpl(HotelRepository hotelRepository) {
//        this.hotelRepository = hotelRepository;
//    }
//
//    public Hotel create(Hotel hotel) {
//        if (hotelRepository != null) {
//          return   hotelRepository.save(hotel);
//        } else {
//            throw new IllegalStateException("hotelRepository is not properly initialized");
//        }
//		
//    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public List<Hotel> getall() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
	  return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found:"+id));
	}
	
	  

}

