package com.backend.clinicaodontologica.test;

import com.backend.clinicaodontologica.dao.impl.OdontologoDaoH2;
import com.backend.clinicaodontologica.model.Odontologo;
import com.backend.clinicaodontologica.service.impl.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import static org.junit.Assert.assertFalse;

public class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

/*
    static void doBefore() {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/Clinica1;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
}

*/
    @Test
    public void deberiaAgregarUnOdontologo() {
        Odontologo odontologo = new Odontologo("12345", "Gerardo", "Arias");
        Odontologo nuevoOdontologo = odontologoService.registrarOdontologo(odontologo);
        Assertions.assertTrue(nuevoOdontologo.getId() != 0);
    }


    @Test
    public void listarTodosLosOdontologos() {
        List<Odontologo> odontologoList = odontologoService.listarOdontologo();
        assertFalse(odontologoList.isEmpty());

    }

}