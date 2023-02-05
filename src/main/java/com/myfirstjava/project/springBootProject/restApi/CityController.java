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

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CityController {
	@NonNull
	private ICityService cityService;

	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
	}
	@GetMapping("/cities/{id}")
	public City getWithId(@PathVariable int id) {
		return cityService.getById(id);
	}
	@PostMapping("/add")
	public void add(City city) {
		cityService.add(city);
	}
	@PostMapping("/update")
	public void update(City city) {
		cityService.update(city);
	}
	@PostMapping("/delete")
	public void delete(City city) {
		cityService.delete(city);
	}	
}
