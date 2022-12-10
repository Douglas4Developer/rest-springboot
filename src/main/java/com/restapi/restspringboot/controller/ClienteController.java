package com.restapi.restspringboot.controller;
import com.restapi.restspringboot.model.entities.Cliente;
import org.springframework.web.bind.annotation. *;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable  int id){
        return new Cliente( id, "Douglas", "468.655.990-12");
    }

    @GetMapping
    public Cliente obterClientePorId2(
            @RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente( id, "Douglas", "468.655.990-12");
    }

}
