package com.fatihbatman.realestatesaleslease.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatihbatman.realestatesaleslease.business.abstracts.HousingTypeService;
import com.fatihbatman.realestatesaleslease.dataAccess.abstracts.HousingTypeRepository;
import com.fatihbatman.realestatesaleslease.entities.HousingType;


@Service
public class HousingTypeManager implements HousingTypeService {
	private HousingTypeRepository housingTypeRepository;
	
	@Autowired
	public HousingTypeManager(HousingTypeRepository housingTypeRepository) {
		this.housingTypeRepository = housingTypeRepository;
	}
	
	@Override
	public List<HousingType> getAll() {
		// TODO Auto-generated method stub
		
		
		return housingTypeRepository.getAll();
	}
	
	
}
