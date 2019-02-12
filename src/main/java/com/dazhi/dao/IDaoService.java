package com.dazhi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dazhi.model.Person;

public interface IDaoService extends JpaRepository<Person, String> {

	public List<Person> findByName(String name);
}
