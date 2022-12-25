package com.example.ressource_humaine.dao;

import com.example.ressource_humaine.bean.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurDao extends JpaRepository<Collaborateur, Long> {


}
