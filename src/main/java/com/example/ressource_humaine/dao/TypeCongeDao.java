package com.example.ressource_humaine.dao;

import com.example.ressource_humaine.bean.DemandeConge;
import com.example.ressource_humaine.bean.TypeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCongeDao extends JpaRepository<TypeConge, Long> {
    TypeConge findByCode(String code);

    int deleteByCode(String code);
}
