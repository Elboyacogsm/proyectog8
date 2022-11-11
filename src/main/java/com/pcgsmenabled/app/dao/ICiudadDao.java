package com.pcgsmenabled.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pcgsmenabled.app.entity.Ciudad;

@Repository
public interface ICiudadDao extends CrudRepository<Ciudad,String>{

}
