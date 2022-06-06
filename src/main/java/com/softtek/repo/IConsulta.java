package com.softtek.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.softtek.modelo.Consulta;

public interface IConsulta extends IGenericRepo<Consulta, Integer> {
	
	@Query(value = "select * from fechas_consultas()", nativeQuery = true)
    List<Object[]> getConsultas();

}
