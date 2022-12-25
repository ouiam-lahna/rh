package com.example.ressource_humaine.bean;


import javax.persistence.*;
import java.util.List;


@Entity
public class DemandeConge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @ManyToOne
    private EtatDemandeConge etatDemandeConge;
    private String dateDemandeur;
    private int nombreJour;
    @ManyToOne
    private TypeConge typeConge;

    @ManyToOne
    private Collaborateur collaborateur;

    public DemandeConge() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    public EtatDemandeConge getEtatDemandeConge() {
        return etatDemandeConge;
    }

    public void setEtatDemandeConge(EtatDemandeConge etatDemandeConge) {
        this.etatDemandeConge = etatDemandeConge;
    }

    public TypeConge getTypeConge() {
        return typeConge;
    }

    public void setTypeConge(TypeConge typeConge) {
        this.typeConge = typeConge;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    public String getDateDemandeur() {
        return dateDemandeur;
    }

    public void setDateDemandeur(String dateDemandeur) {
        this.dateDemandeur = dateDemandeur;
    }

    public int getNombreJour() {
        return nombreJour;
    }

    public void setNombreJour(int nombreJour) {
        this.nombreJour = nombreJour;
    }

 
}
