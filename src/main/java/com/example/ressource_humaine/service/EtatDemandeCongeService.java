package com.example.ressource_humaine.service;

import com.example.ressource_humaine.bean.EtatDemandeConge;
import com.example.ressource_humaine.dao.EtatDemandeCongeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtatDemandeCongeService {


    public int save(EtatDemandeConge etatDemandeConge){
        if(findByCode(etatDemandeConge.getCode())!=null){
            return -1;
        }
        else {
            etatDemandeCongeDao.save(etatDemandeConge);
            return 1;
        }
    }

    public EtatDemandeConge findByCode(String code) {
        return etatDemandeCongeDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return etatDemandeCongeDao.deleteByCode(code);
    }

    public List<EtatDemandeConge> findAll() {
        return etatDemandeCongeDao.findAll();
    }

    @Autowired
    private EtatDemandeCongeDao etatDemandeCongeDao;
}
