package com.spring_example.controller;

// Importações necessárias para o tratamento de erros
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

// @ControllerAdvice é uma anotação que permite tratar exceções de forma global
// em todos os controllers da aplicação. É como um "interceptador" de erros.
@ControllerAdvice
public class CustomErrorHandler {

    // @ExceptionHandler define que este método vai tratar uma exceção específica
    // No caso, NoHandlerFoundException (quando uma rota não existe)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<String> handleRouteNotFound(NoHandlerFoundException ex) {
        // ResponseEntity nos permite controlar a resposta HTTP completa,
        // incluindo status code e corpo da mensagem

        // Monta uma mensagem amigável com a rota que não foi encontrada
        String errorMessage = "⚠️ Rota '" + ex.getRequestURL() + "' não existe. " +
                "Endpoints válidos: /api/hello, /api/hello/{nome}, /api/hello/{nome}/{sobrenome}";

        // Retorna a mensagem com status HTTP 404 (NOT_FOUND)
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorMessage);
    }
}