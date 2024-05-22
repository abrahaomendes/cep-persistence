package com.example.ceppersist.feign;

import com.example.ceppersist.domain.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "viacep.com.br/ws/")
public interface CepClient {

    @GetMapping("{cep}/json")
    Cep fetchCEP(@PathVariable("cep") String cep);
}
