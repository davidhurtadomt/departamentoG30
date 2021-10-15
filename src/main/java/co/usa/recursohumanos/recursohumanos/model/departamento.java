package co.usa.recursohumanos.recursohumanos.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="departamento")
public class departamento implements Serializable{
    //Campo llave primaria y autoincremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numId;
    private String nombreDepartamento;
    private Date fechaCreacionDate;

    //Realizamos la relacion
    @OneToMany(cascade ={CascadeType.PERSIST}, mappedBy = "departamento" ) //Sentencia uno a muchos
    @JsonIgnoreProperties("departamento")
    private List<Empleado> empleados;

    public Integer getNumId() {
        return numId;
    }
    public void setNumId(Integer numId) {
        this.numId = numId;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public Date getFechaCreacionDate() {
        return fechaCreacionDate;
    }
    public void setFechaCreacionDate(Date fechaCreacionDate) {
        this.fechaCreacionDate = fechaCreacionDate;
    }
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}