package com.example.ressource_humaine.dao;

import com.example.ressource_humaine.bean.DemandeConge;
import com.example.ressource_humaine.bean.TypeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandeCongeDao extends JpaRepository<DemandeConge, Long> {

    DemandeConge findByReference(String reference);

    int deleteByReference(String reference);

}
