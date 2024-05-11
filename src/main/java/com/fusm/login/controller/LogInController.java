package com.fusm.login.controller;

import com.fusm.login.model.User;
import com.fusm.login.model.UserRequest;
import com.fusm.login.service.ILogInService;
import com.fusm.login.util.AppRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase que expone los servicios necesarios para realizar el inicio de sesión
 * ITSense Inc - Andrea Gómez
 */

@RestController
@RequestMapping(value = AppRoutes.LOGIN_ROUTE)
public class LogInController {

    @Autowired
    private ILogInService logInService;


    /**
     * Inicio de sesión
     * @param userRequest Modelo que contiene la ifnormación necesaria para realizar el inicio de sesión dentro de la aplicación
     * @return Información del usuario
     */
    @PostMapping
    private ResponseEntity<User> logIn(
            @RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(logInService.logIn(userRequest));
    }

}
