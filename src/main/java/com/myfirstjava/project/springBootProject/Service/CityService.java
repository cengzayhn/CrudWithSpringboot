package com.myfirstjava.project.springBootProject.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.myfirstjava.project.springBootProject.Dal.ICityDataAccess;
import com.myfirstjava.project.springBootProject.Entities.City;

@Service
public class CityService implements ICityService{

	private ICityDataAccess cityData;
	
	@Autowired
	public CityService(ICityDataAccess cityData) {
		this.cityData = cityData;
	}
	
	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityData.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityData.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityData.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityData.delete(city);
	}

	@Override
	@Transactional
	public City getById(int id) {
		return this.cityData.getById(id);
	}

}
