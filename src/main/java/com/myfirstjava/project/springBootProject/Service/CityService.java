package com.myfirstjava.project.springBootProject.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.myfirstjava.project.springBootProject.Dal.ICityDataAccess;
import com.myfirstjava.project.springBootProject.Entities.City;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CityService implements ICityService{

	@NonNull
	private ICityDataAccess cityData;
	
	@Override
	@Transactional
	public List<City> getAll() {
		return cityData.getAll();
	}
	@Override
	@Transactional
	public void add(City city) {
		cityData.add(city);
		
	}
	@Override
	@Transactional
	public void update(City city) {
		cityData.update(city);
	}
	@Override
	@Transactional
	public void delete(City city) {
		cityData.delete(city);
	}
	@Override
	@Transactional
	public City getById(int id) {
		return cityData.getById(id);
	}

}
