package com.myfirstjava.project.springBootProject.Dal;
import java.util.List;

import com.myfirstjava.project.springBootProject.Entities.City;

public interface ICityDataAccess {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);	
}
