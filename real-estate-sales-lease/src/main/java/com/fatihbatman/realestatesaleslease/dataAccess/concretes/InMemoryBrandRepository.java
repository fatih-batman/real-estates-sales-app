package com.fatihbatman.realestatesaleslease.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fatihbatman.realestatesaleslease.dataAccess.abstracts.HousingTypeRepository;
import com.fatihbatman.realestatesaleslease.entities.HousingType;

@Repository
public class InMemoryBrandRepository implements HousingTypeRepository {
	
	public List<HousingType> housingTypeList;
	
	
	
	public InMemoryBrandRepository() {
		super();
		this.housingTypeList = new ArrayList<HousingType>();
		HousingType h = new HousingType(1, "waq");
		HousingType h2 = new HousingType(1, "iki");
		HousingType h3 = new HousingType(1, "üç");
		HousingType h4 = new HousingType(1, "dört");
		housingTypeList.add(h);
		housingTypeList.add(h2);
		housingTypeList.add(h3);
		housingTypeList.add(h4);
	}



	@Override
	public List<HousingType> getAll(){
		
		return housingTypeList;
	}
	

}
