package com.spring_example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    // Rota básica
    @GetMapping("/hello")
    public String sayHello() {
        return "Olá, mundo! Esta é minha primeira API Spring Boot!";
    }

    // Rota com nome opcional (aceita /hello/ e /hello/nome)
    @GetMapping({"/hello/{nome}", "/hello/"})
    public String sayHelloPersonalizado(@PathVariable(required = false) String nome) {
        if (nome == null || nome.isEmpty()) {
            return "Olá, visitante! Bem-vindo ao Spring Boot!";
        }
        return "Olá, " + nome + "! Bem-vindo ao Spring Boot!";
    }

    // Rota com nome e sobrenome (exige ambos parâmetros)
    @GetMapping("/hello/{nome}/{sobrenome}")
    public String sayHelloPersonalizadoComSobrenome(
            @PathVariable String nome,
            @PathVariable String sobrenome) {

        return "Olá, " + nome + " " + sobrenome + "! Bem-vindo ao Spring Boot!";
    }
}