package com.fatihbatman.realestatesaleslease.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatihbatman.realestatesaleslease.business.abstracts.HousingTypeService;
import com.fatihbatman.realestatesaleslease.business.concretes.HousingTypeManager;
import com.fatihbatman.realestatesaleslease.entities.HousingType;

@RestController
@RequestMapping("/api/housingType")
public class HousingTypesController {
	private HousingTypeService housingTypeService;
	
	@Autowired
	public HousingTypesController(HousingTypeService housingTypeService) {
		super();
		this.housingTypeService = housingTypeService;
	}
	
	@GetMapping("/getAll")
	public List<HousingType> getAll(){
		return housingTypeService.getAll();
	}
	

}
