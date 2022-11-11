package com.pcgsmenabled.app.service;

import java.util.List;

import com.pcgsmenabled.app.entity.Pais;

public interface IPaisService {
	public List<Pais> findAll(); //SELECT * FROM PAIS
		
	public Pais findById(String id); //SELECT * FROM PAIS WHERE ID=?
		
	public Pais save(Pais pais);//INSERT INTO pais()
		
	public void delete(String id);//DELETE FROM PAIS WHERE ID=?

}
