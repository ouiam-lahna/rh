package com.example.ressource_humaine.dao;

import com.example.ressource_humaine.bean.EtatDemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatDemandeCongeDao extends JpaRepository<EtatDemandeConge,Long> {

    EtatDemandeConge findByCode(String code);

    int deleteByCode(String code);
}
