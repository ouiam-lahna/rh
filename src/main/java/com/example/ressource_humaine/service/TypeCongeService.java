package com.example.ressource_humaine.service;

import com.example.ressource_humaine.bean.DemandeConge;
import com.example.ressource_humaine.bean.TypeConge;
import com.example.ressource_humaine.dao.TypeCongeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeCongeService {


    public TypeConge findByCode(String code) {
        return typeCongeDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return typeCongeDao.deleteByCode(code);
    }

    public List<TypeConge> findAll() {
        return typeCongeDao.findAll();
    }

    @Autowired
    private TypeCongeDao typeCongeDao;
}
