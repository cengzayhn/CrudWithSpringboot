package com.myfirstjava.project.springBootProject.restApi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myfirstjava.project.springBootProject.Entities.City;
import com.myfirstjava.project.springBootProject.Service.ICityService;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;
	
	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	 
	@GetMapping("/cities")
	public List<City> get(){
		return this.cityService.getAll();
	}
	@GetMapping("/cities/{id}")
	public City getWithId(@PathVariable int id) {
		return this.cityService.getById(id);
	}
	@PostMapping("/add")
	public void add(City city) {
		this.cityService.add(city);
	}
	@PostMapping("/update")
	public void update(City city) {
		this.cityService.update(city);
	}
	@PostMapping("/delete")
	public void delete(City city) {
		this.cityService.delete(city);
	}
	
	
}
