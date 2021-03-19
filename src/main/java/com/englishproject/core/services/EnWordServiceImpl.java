package com.englishproject.core.services;

import com.englishproject.core.model.EnWord;
import com.englishproject.core.repositories.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService {

    private final EnWordRepository enWordRepository;

    @Override
    public EnWord getEnWord(Long id) {
        return enWordRepository.getById(id);
    }
}
