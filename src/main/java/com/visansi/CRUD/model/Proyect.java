package com.visansi.CRUD.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proyect {
    private int id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private List<Activity> actividades;
    private List<Service> servicios;

    // Constructor
    public Proyect(int id, String nombre, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = "En planificación"; // Estado inicial
        this.actividades = new ArrayList<Activity>();
        this.servicios = new ArrayList<>();
    }

    // Métodos públicos
    public void agregarActividad(Activity actividad) {
        this.actividades.add(actividad);
        System.out.println("Actividad '" + actividad.getNombre() + "' agregada al proyecto '" + nombre + "'.");
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del proyecto '" + nombre + "' ha cambiado a: " + nuevoEstado);
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public List<Activity> getActividades() {
        return actividades;
    }

    public List<Service> getServicios() {
        return servicios;
    }
}