package co.usa.recursohumanos.recursohumanos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursohumanos.recursohumanos.model.departamento;
import co.usa.recursohumanos.recursohumanos.repository.crud.departamentoCrudRepositorio;

@Repository
public class departamentoRepositorio {
    @Autowired
    private departamentoCrudRepositorio departamentoCrudRepositorio;

    public List<departamento>getAll(){
        return (List<departamento>)departamentoCrudRepositorio.findAll();
    }

    public Optional<departamento>getDepartamento(int id){
        return departamentoCrudRepositorio.findById(id);
    }

    public departamento save(departamento dpto){
        return departamentoCrudRepositorio.save(dpto);
    }
}