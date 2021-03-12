package com.englishproject.core.controllers;

import com.englishproject.core.dto.UserDTO;
import com.englishproject.core.mappers.UserMapper;
import com.englishproject.core.model.User;
import com.englishproject.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{id}")
    public UserDTO getUser(@PathVariable Long id){
        User user = userService.getUser(id);
        return UserMapper.INSTANCE.toDTO(user);
    }
}

