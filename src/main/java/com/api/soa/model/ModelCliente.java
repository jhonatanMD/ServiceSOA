package com.api.soa.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {    
    "dni",
    "nombre",
    "clientes"
})
@XmlRootElement(name = "cliente")
public class ModelCliente {
	


    @XmlElement(name = "dni", required = true)
    private String dni;
    @XmlElement(name = "nombre", required = true)
    private String nombre;
    @XmlElement(name = "clientes", required = true)
    private List<ModelCliente> clientes;
    
    

    public ModelCliente() {}
    
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

	public List<ModelCliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<ModelCliente> clientes) {
		this.clientes = clientes;
	}
    

}
