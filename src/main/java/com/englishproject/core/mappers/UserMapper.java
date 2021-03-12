package com.englishproject.core.mappers;


import com.englishproject.core.dto.UserDTO;
import com.englishproject.core.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    UserDTO toDTO(User user);
}
