package com.pcgsmenabled.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.pcgsmenabled.app.dao.IDepartamentoDao;
import com.pcgsmenabled.app.entity.Departamento;

public class DepartamentoServiceImple implements IDepartamentoService {
	
	@Autowired
	private IDepartamentoDao departamentoDao;
	@Override
	@Transactional (readOnly = true)
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return (List<Departamento>) departamentoDao.findAll();
	}

	@Override
	@Transactional (readOnly = true)
	public Departamento findById(String id) {
		// TODO Auto-generated method stub
		return departamentoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Departamento save(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDao.save(departamento);
	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		departamentoDao.deleteById(id);

	}

}
