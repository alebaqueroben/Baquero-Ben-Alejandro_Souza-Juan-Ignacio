package com.backend.clinicaodontologica.service.impl;

import com.backend.clinicaodontologica.dao.IDao;
import com.backend.clinicaodontologica.model.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) { this.odontologoIDao = odontologoIDao;}

    public Odontologo registrarOdontologo(Odontologo odontologo) {return odontologoIDao.registrar(odontologo);}

    public List<Odontologo> listarOdontologo() {return odontologoIDao.listarTodos();}

    //capa de logica de negocio que interactua con la capa de persistencia, pero desconoce los detalles de la implementacion de esa persistencia
}