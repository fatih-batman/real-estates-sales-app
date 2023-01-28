package com.fatihbatman.realestatesaleslease.dataAccess.abstracts;

import java.util.List;
import com.fatihbatman.realestatesaleslease.entities.HousingType;

public interface HousingTypeRepository {

	List<HousingType> getAll();

}
