package com.fusm.login.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fusm.login.exception.GlobalExceptionHandler;
import com.fusm.login.model.User;
import com.fusm.login.model.UserRequest;
import com.fusm.login.service.ILogInService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class LogInService implements ILogInService {

    Logger logger = LoggerFactory.getLogger(LogInService.class);


    @Override
    public User logIn(UserRequest userRequest) {
        logger.info("User {" + userRequest.getEmail() + "} tried to login at {" + new Date() + "}");
        List<User> users = getUsers();
        return searchUser(users, userRequest);
    }

    private User searchUser(List<User> users, UserRequest userRequest) {
        return users.stream()
                .filter(user -> user.getEmail().equals(userRequest.getEmail()) && user.getPassword().equals(userRequest.getPassword()))
                .findFirst()
                .orElse(null);
    }

    private List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(
                User.builder()
                        .email("decano.atenea@gmail.com")
                        .password("123456")
                        .name("Decano 1 user")
                        .faculty(11)
                        .role(5)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("decano2.atenea@fusm.edu.co")
                        .password("123456")
                        .name("Decano 2 user")
                        .faculty(13)
                        .role(5)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("vicerrector.atenea@gmail.com")
                        .password("123456")
                        .name("Vicer rector user")
                        .role(2)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("estudiante@fusm.edu.co")
                        .password("123456")
                        .name("Estudiante user")
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .role(4)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("director.fs.atenea@gmail.com")
                        .password("123456")
                        .name("director user")
                        .faculty(11)
                        .role(1)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("director2.fs.atenea@gmail.com")
                        .password("123456")
                        .name("director 2 user")
                        .faculty(11)
                        .role(1)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("root.fs.atenea@gmail.com")
                        .password("123456")
                        .name("administrador user")
                        .role(3)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("root2.fs.atenea@gmail.com")
                        .password("123456")
                        .name("administrador user")
                        .role(3)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("calidad.fs.atenea@gmail.com")
                        .password("123456")
                        .name("calidad user")
                        .role(6)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("robimar.vera@itsense.com.co")
                        .password("123456")
                        .name("Decano Robimar")
                        .faculty(11)
                        .role(5)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("luisa.monsalve@itsense.com.co")
                        .password("123456")
                        .name("Decano Luisa")
                        .faculty(11)
                        .role(5)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("cristian.gomez@itsense.com.co")
                        .password("123456")
                        .name("Vicerrector cristian")
                        .role(2)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("brayan.guardo@itsense.com.co")
                        .password("123456")
                        .name("Vicerrector Brayan")
                        .role(2)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("laura.sanchez@itsense.com.co")
                        .password("123456")
                        .name("Director Valentina")
                        .faculty(11)
                        .role(1)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("andrea.gomez@itsense.com.co")
                        .password("123456")
                        .name("Calidad Andrea")
                        .role(6)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("sergio.galvis@itsense.com.co")
                        .password("123456")
                        .name("Calidad Sergio")
                        .role(6)
                        .build()
        );
        userList.add(
                User.builder()
                        .email("docente@gmail.com")
                        .password("123456")
                        .name("Docente coordinador")
                        .role(7)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("docente.andrea@gmail.com")
                        .password("123456")
                        .name("Docente coordinador andrea")
                        .role(7)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("damon.salvatore@gmail.com")
                        .password("123456")
                        .name("Damon Salvatore profe")
                        .role(9)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("pepito.perez@gmail.com")
                        .password("123456")
                        .name("Pepito Perez basico profe")
                        .role(9)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("monkey.d.luffy@gmail.co")
                        .password("123456")
                        .name("Monkey D Luffy Rey basico profe")
                        .role(9)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("luis.camilo@gmail.com")
                        .password("123456")
                        .name("Luis camilo Estudiante")
                        .role(4)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("sharpay.ryan@gmail.com")
                        .password("123456")
                        .name("Sharpay Ryan estudiante")
                        .role(4)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("juan.gabriel@itsense.com.co")
                        .password("123456")
                        .name("Juan Gabriel Estudiante")
                        .role(4)
                        .faculty(11)
                        .programId(new Integer[]{1})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("elena.martinez@itsense.com.co")
                        .password("123456")
                        .name("Elena martinez Estudiante")
                        .role(10)
                        .faculty(11)
                        .programId(new Integer[]{28})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("alejandro.lopez@itsense.com.co")
                        .password("123456")
                        .name("Alejandro Lopez Estudiante")
                        .role(10)
                        .faculty(11)
                        .programId(new Integer[]{28})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("maria.rodriguez@itsense.com.co")
                        .password("123456")
                        .name("Maria Rodriguez Estudiante")
                        .role(10)
                        .faculty(11)
                        .programId(new Integer[]{28})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("juan.garcia@itsense.com.co")
                        .password("123456")
                        .name("Juan Garcia Estudiante")
                        .role(10)
                        .faculty(11)
                        .programId(new Integer[]{28})
                        .build()
        );
        userList.add(
                User.builder()
                        .email("fernando.vigolla@gmail.com")
                        .password("123456")
                        .name("Fernando Vigolla Marchena")
                        .role(11)
                        .faculty(11)
                        .programId(new Integer[]{28})
                        .build()
        );

        return userList;
    }

}
