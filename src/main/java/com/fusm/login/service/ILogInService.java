package com.fusm.login.service;

import com.fusm.login.model.User;
import com.fusm.login.model.UserRequest;
import org.springframework.stereotype.Service;

@Service
public interface ILogInService {

    User logIn(UserRequest userRequest);

}
