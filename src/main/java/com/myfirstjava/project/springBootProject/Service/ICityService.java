package com.myfirstjava.project.springBootProject.Service;
import java.util.List;

import com.myfirstjava.project.springBootProject.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
	
}
