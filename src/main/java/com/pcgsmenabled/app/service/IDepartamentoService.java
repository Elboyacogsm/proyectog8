package com.pcgsmenabled.app.service;

import java.util.List;

import com.pcgsmenabled.app.entity.Departamento;

public interface IDepartamentoService {
	
	public List<Departamento> findAll();
	
	
	public Departamento findById(String id);
	
	public Departamento save(Departamento departamento );
	
	public void delete(String id);

	


}
