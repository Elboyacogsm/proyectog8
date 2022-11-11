package com.pcgsmenabled.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pcgsmenabled.app.entity.Pais;

@Repository
public interface IPaisDao extends CrudRepository<Pais,String> {

}
