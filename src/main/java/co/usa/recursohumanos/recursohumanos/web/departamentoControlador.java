package co.usa.recursohumanos.recursohumanos.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.usa.recursohumanos.recursohumanos.model.departamento;
import co.usa.recursohumanos.recursohumanos.service.departamentoServicio;

@RestController
@RequestMapping("/api/departamento")
@CrossOrigin(origins ="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class departamentoControlador {
    @Autowired
    private departamentoServicio departamentoServicio;

    @GetMapping("/all")
    public List<departamento>getDepartamento(){
        //Metodo que permite consultar por todo
        return departamentoServicio.getAll();
    }

    @GetMapping("/{numId}")
    public Optional<departamento>getDepartamento(@PathVariable("numId") int id){ //@pathVariable nos permite convertir el GetMapping JSON del Get a numero para que la funcion Optional lo pueda leer
        return departamentoServicio.getDepartamento(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public departamento save(@RequestBody departamento dpto){
        return departamentoServicio.save(dpto);
    }

    
    
}
