package com.englishproject.core.controllers;

import com.englishproject.core.dto.EnWordDTO;
import com.englishproject.core.dto.UserDTO;
import com.englishproject.core.mappers.EnWordMapper;
import com.englishproject.core.mappers.UserMapper;
import com.englishproject.core.model.EnWord;
import com.englishproject.core.model.User;
import com.englishproject.core.services.EnWordService;
import com.englishproject.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnWordMapper enWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDTO getUser(@PathVariable Long id){
        EnWord enWord = enWordService.getEnWord(id);
        return enWordMapper.toDTO(enWord);
    }
}

