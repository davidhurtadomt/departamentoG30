package co.usa.recursohumanos.recursohumanos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursohumanos.recursohumanos.model.departamento;
import co.usa.recursohumanos.recursohumanos.repository.departamentoRepositorio;

@Service
public class departamentoServicio {
    @Autowired
    private departamentoRepositorio departamentoRepositorio;

    public List<departamento>getAll(){
        return departamentoRepositorio.getAll();
    }

    public Optional<departamento>getDepartamento(int id){
        return departamentoRepositorio.getDepartamento(id);
    }

    public departamento save(departamento dpto){
        //Primero verificamos si el departamento es nuevo y de ser asi guarda
        if(dpto.getNumId()==null){
            return departamentoRepositorio.save(dpto);
        }else{ //Si el objeto viene con un Id verificamos si existe o no
            Optional<departamento> consulta= departamentoRepositorio.getDepartamento(dpto.getNumId());
            if (consulta.isEmpty()){
                return departamentoRepositorio.save(dpto);
            } else{
                return dpto;
            }

        }

    }
    
}
