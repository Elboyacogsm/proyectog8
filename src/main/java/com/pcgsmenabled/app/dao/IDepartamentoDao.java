package com.pcgsmenabled.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pcgsmenabled.app.entity.Departamento;

@Repository
public interface IDepartamentoDao extends CrudRepository<Departamento,String> {

}
