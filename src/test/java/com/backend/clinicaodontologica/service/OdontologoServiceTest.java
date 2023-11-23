package com.backend.clinicaodontologica.test;

import com.backend.clinicaodontologica.dao.impl.OdontologoDaoH2;
import com.backend.clinicaodontologica.entity.Odontologo;
import com.backend.clinicaodontologica.service.impl.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


    @Test
    public void deberiaAgregarUnOdontologo() {
        Odontologo odontologo = new Odontologo("12345", "Gerardo", "Arias");
        Odontologo odontologo2 = new Odontologo("12344", "Andres", "Arias");
        Odontologo nuevoOdontologo = odontologoService.registrarOdontologo(odontologo);
        Odontologo nuevoOdontologo2 = odontologoService.registrarOdontologo(odontologo2);
        Assertions.assertTrue(nuevoOdontologo.getId() != 0);
        Assertions.assertTrue(nuevoOdontologo2.getId() != 0);
    }


    @Test
    public void listarTodosLosOdontologos() {
        List<Odontologo> odontologoList = odontologoService.listarOdontologo();
        assertFalse(odontologoList.isEmpty());

    }

}