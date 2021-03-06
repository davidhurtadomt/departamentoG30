package co.usa.recursohumanos.recursohumanos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursohumanos.recursohumanos.model.Empleado;
import co.usa.recursohumanos.recursohumanos.repository.crud.EmpleadoCrudRepositorio;

@Repository
public class EmpleadoRepositorio {
    @Autowired
    private EmpleadoCrudRepositorio empleadoCrudRepositorio;

    public List<Empleado>getAll(){
        return (List<Empleado>) empleadoCrudRepositorio.findAll();
    }

    public Optional<Empleado>getEmpleado(int id){
        return empleadoCrudRepositorio.findById(id);
    }

    public Empleado save(Empleado empleado){
        return empleadoCrudRepositorio.save(empleado);
    }    
}
