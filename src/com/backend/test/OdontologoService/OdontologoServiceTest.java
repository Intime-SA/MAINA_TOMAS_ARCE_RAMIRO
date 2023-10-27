package com.backend.test.OdontologoService;

import com.backend.dao.imp.OdontologoDaoH2;
import com.backend.service.OdontologoService;
import model.Odontologo;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.sql.Connection;
import java.sql.DriverManager;

class OdontologoServiceTest {


    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


    @BeforeAll
    static void doBefore() {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/testClase;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");

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
        model.Odontologo odontologoRegistrado = new Odontologo(12, "asd1230", "Matias", "Arce");
        Logger LOGGER = Logger.getLogger(OdontologoServiceTest.class);
        LOGGER.info("Registro creado con exito. Odontologo: " + odontologoRegistrado);

        Assertions.assertTrue(odontologoRegistrado.getId() != 0);

    }}