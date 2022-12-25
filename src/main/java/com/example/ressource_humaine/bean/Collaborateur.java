package com.example.ressource_humaine.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collaborateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Collaborateur() {
    }

    public Collaborateur(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Collaborateur{" +
                "id=" + id +
                '}';
    }
}
