package com.pcgsmenabled.app.service;

import java.util.List;

import com.pcgsmenabled.app.entity.Ciudad;

public interface ICiudadService {
public List<Ciudad> findAll();
	
	
	public Ciudad findById(String id);
	
	public Ciudad save(Ciudad ciudad );
	
	public void delete(String id);


}
