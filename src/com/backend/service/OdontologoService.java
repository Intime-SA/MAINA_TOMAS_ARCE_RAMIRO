package com.backend.service;

import com.backend.dao.IDao;


import java.util.List;

public class OdontologoService {



    private IDao<model.Odontologo> odontologoIDao;

    public OdontologoService(IDao<model.Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public model.Odontologo registrarOdontologo(model.Odontologo odontologo){
        return odontologoIDao.registrar(odontologo);
    }

    public List<model.Odontologo> listarOdontologo(){
        return odontologoIDao.listarTodos();
    }


}
