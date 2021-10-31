package com.ProyectoDesarrolloWeb.spring.app.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.ProyectoDesarrolloWeb.spring.app.entities.Configuraciones;

@Repository
public interface ConfiguracionesRepository extends PagingAndSortingRepository<Configuraciones, Long>{


}
