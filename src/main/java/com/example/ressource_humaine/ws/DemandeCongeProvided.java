package com.example.ressource_humaine.ws;

import com.example.ressource_humaine.bean.DemandeConge;
import com.example.ressource_humaine.service.DemandeCongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demande-conge")
public class DemandeCongeProvided {


    @PostMapping("/")
    public int save(@RequestBody DemandeConge demandeConge) {
        return demandeCongeService.save(demandeConge);
    }

    @PutMapping("/")
    public int update(@RequestBody DemandeConge demandeConge) {
        return demandeCongeService.update(demandeConge);
    }


    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return demandeCongeService.deleteByReference(reference);
    }


    @GetMapping("/reference/{reference}")
    public DemandeConge findByReference(@PathVariable String reference) {
        return demandeCongeService.findByReference(reference);
    }

    @GetMapping("/")
    public List<DemandeConge> findAll() {
        return demandeCongeService.findAll();
    }

    @Autowired
    private DemandeCongeService demandeCongeService;
}
