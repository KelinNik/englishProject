package com.englishproject.core.mappers;


import com.englishproject.core.dto.EnWordDTO;
import com.englishproject.core.model.EnWord;
import org.mapstruct.Mapper;

@Mapper
public interface EnWordMapper {
    EnWordDTO toDTO(EnWord enWord);
}
