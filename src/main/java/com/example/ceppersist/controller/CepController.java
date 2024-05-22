package com.example.ceppersist.controller;


import com.example.ceppersist.domain.Cep;
import com.example.ceppersist.request.CepRequest;
import com.example.ceppersist.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepController {

    private final CepService service;

    private Cep cepbd;

    public CepController(CepService service) {
        this.service = service;
    }
    @GetMapping("/saveCep")
    public ResponseEntity<String> saveCep(@RequestBody CepRequest cep){
        service.fechCep(cep);
        return ResponseEntity.ok().body("Cep Salvo com sucesso!");
    }

}
