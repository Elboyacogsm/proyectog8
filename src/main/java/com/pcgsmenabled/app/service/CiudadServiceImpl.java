package com.pcgsmenabled.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pcgsmenabled.app.dao.ICiudadDao;
import com.pcgsmenabled.app.entity.Ciudad;

@Service
public class CiudadServiceImpl implements ICiudadService {
	
	@Autowired
	private ICiudadDao ciudadDao;
	@Override
	@Transactional (readOnly = true)
	public List<Ciudad> findAll() {
		// TODO Auto-generated method stub
		return (List<Ciudad>) ciudadDao.findAll();
		
	}

	@Override
	@Transactional (readOnly = true)
	public Ciudad findById(String id) {
		// TODO Auto-generated method stub
		return ciudadDao.findById(id).orElse (null);
	}

	@Override
	@Transactional
	public Ciudad save(Ciudad ciudad) {
		// TODO Auto-generated method stub
		return ciudadDao.save(ciudad);
	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		ciudadDao.deleteById(id);

	}

}
