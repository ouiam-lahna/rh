package com.example.ressource_humaine.service;

import com.example.ressource_humaine.bean.Collaborateur;
import com.example.ressource_humaine.dao.CollaborateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CollaborateurService {

    @Transactional
    public void deleteById(Long id) {
        collaborateurDao.deleteById(id);
    }

    public List<Collaborateur> findAll() {
        return collaborateurDao.findAll();
    }

    @Autowired
    private CollaborateurDao collaborateurDao;
}
