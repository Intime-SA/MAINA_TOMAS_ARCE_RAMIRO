package com.backend.service;

import com.backend.dao.imp.OdontologoDaoH2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

class OdontologoServiceTest {

    @Test
    void registrarOdontologo() {
    }


    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


    @BeforeAll
    static void doBefore() {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/testClase;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "saa");

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

    @Test
    void deberiaAgregarUnOdontologo() {

        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
        model.Odontologo odontologoRegistrado = new model.Odontologo("asd123", "Tomas", "Arce");

        Assertions.assertTrue(odontologoRegistrado.getId() != 0);
    }}