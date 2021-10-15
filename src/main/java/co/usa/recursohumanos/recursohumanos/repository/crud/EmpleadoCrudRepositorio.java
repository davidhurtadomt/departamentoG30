package co.usa.recursohumanos.recursohumanos.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.usa.recursohumanos.recursohumanos.model.Empleado;

public interface EmpleadoCrudRepositorio extends CrudRepository<Empleado, Integer> {
    
}
