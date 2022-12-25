package com.example.ressource_humaine.service;

import com.example.ressource_humaine.bean.DemandeConge;
import com.example.ressource_humaine.dao.DemandeCongeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemandeCongeService {

    public int save(DemandeConge demandeConge) {
        DemandeConge addDemande = demandeCongeDao.findByReference(demandeConge.getReference());
        if (addDemande != null) {
            return -1;
        } else {
            demandeCongeDao.save(demandeConge);
            return 1;
        }
    }


    public int update(DemandeConge demandeConge) {

        DemandeConge updateDemandeConge = demandeCongeDao.findByReference(demandeConge.getReference());
        if (updateDemandeConge == null) {
            return -1;
        } else {
            updateDemandeConge.setReference(demandeConge.getReference());
            updateDemandeConge.setEtatDemandeConge(demandeConge.getEtatDemandeConge());
            updateDemandeConge.setDateDemandeur(demandeConge.getDateDemandeur());
            updateDemandeConge.setNombreJour(demandeConge.getNombreJour());
            updateDemandeConge.setTypeConge(demandeConge.getTypeConge());
            updateDemandeConge.setCollaborateur(demandeConge.getCollaborateur());
            demandeCongeDao.save(updateDemandeConge);
            return 1;
        }
    }

    @Transactional
    public int deleteByReference(String reference) {
        DemandeConge deleteDemandeConge = demandeCongeDao.findByReference(reference);
        if (deleteDemandeConge == null) {
            return -1;
        } else {
            demandeCongeDao.deleteById(deleteDemandeConge.getId());
            return 1;
        }

    }

    public DemandeConge findByReference(String reference) {
        return demandeCongeDao.findByReference(reference);
    }

    public List<DemandeConge> findAll() {
        return demandeCongeDao.findAll();
    }

    @Autowired
    private DemandeCongeDao demandeCongeDao;


}
