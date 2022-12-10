package com.restapi.restspringboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora") // ROTA
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}") // RECURSO
    public int calcularSoma(@PathVariable int a, @PathVariable int b){
        return a + b;
    }
    @GetMapping("/subtrair")
    public int calcularSubtracao(
            @RequestParam(name = "a")int a,
            @RequestParam(name = "b")int b) {
        return a - b;
    }
}
