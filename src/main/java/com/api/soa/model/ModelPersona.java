package com.api.soa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {    
    "dni",
    "nombre"
})
@XmlRootElement(name = "cliente")
public class ModelPersona {
	


    @XmlElement(name = "dni", required = true)
    private String dni;
    @XmlElement(name = "nombre", required = true)
    private String nombre;
    

    public ModelPersona() {}
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
