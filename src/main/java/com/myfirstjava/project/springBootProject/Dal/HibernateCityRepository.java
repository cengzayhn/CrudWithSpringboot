package com.myfirstjava.project.springBootProject.Dal;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myfirstjava.project.springBootProject.Entities.City;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateCityRepository implements ICityDataAccess{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<City> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities= session.createQuery("from City",City.class).getResultList();
		return cities;
		
	}

	@Override
	@Transactional
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(city);
		 
	}

	@Override
	@Transactional
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getId());
		session.remove(cityToDelete);
	}

	@Override
	@Transactional
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;
	}

}
