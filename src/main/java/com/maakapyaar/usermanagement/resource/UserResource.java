package com.maakapyaar.usermanagement.resource;

import com.maakapyaar.usermanagement.model.document.User;
import com.maakapyaar.usermanagement.model.view.UserVM;
import com.maakapyaar.usermanagement.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usermanagement")
@Slf4j
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody UserVM signUpRequest) {
        log.debug("User sign up requested =>");
        User systemUser1 = userService.addUser(signUpRequest);
        log.debug("Successfully created user for email: {}", systemUser1.getEmail());
        return new ResponseEntity<>(systemUser1, HttpStatus.CREATED);
    }
}