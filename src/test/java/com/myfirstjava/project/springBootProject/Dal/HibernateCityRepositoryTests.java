package com.myfirstjava.project.springBootProject.Dal;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


class HibernateCityRepositoryTests {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	HibernateCityRepository cityData = new HibernateCityRepository(entityManager);
	
	@Test
	@DisplayName("getAll Not Null Test")
	public void getAllNotNullTest() {
		Assertions.assertNotNull(cityData.getAll());
	}
	
	@Test
	@DisplayName("getById Not Null Test")
	public void getByIdNotNullTest() {
		final int id = 1;
		Assertions.assertNotNull(cityData.getById(id));
	}
}
