package com.example.ceppersist.service;

import com.example.ceppersist.domain.Cep;
import com.example.ceppersist.feign.CepClient;

import com.example.ceppersist.repository.CepRepository;
import com.example.ceppersist.request.CepRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    private final CepClient client;
    @Autowired
    private CepRepository repository;

    public CepService(CepClient client) {
        this.client = client;
    }

    public void fechCep(CepRequest request){
        Cep data = client.fetchCEP(request.getCep());
        if(data.getCep() != null) {
            repository.save(data);
        }else {
            throw new RuntimeException();
        }
    }


}
