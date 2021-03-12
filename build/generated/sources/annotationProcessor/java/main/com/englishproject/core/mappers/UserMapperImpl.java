package com.englishproject.core.mappers;

import com.englishproject.core.dto.RoleDTO;
import com.englishproject.core.dto.RoleDTO.RoleDTOBuilder;
import com.englishproject.core.dto.UserDTO;
import com.englishproject.core.dto.UserDTO.UserDTOBuilder;
import com.englishproject.core.model.Role;
import com.englishproject.core.model.User;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-11T17:37:42+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.3 (JetBrains s.r.o)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( user.getId() );
        userDTO.email( user.getEmail() );
        userDTO.password( user.getPassword() );
        userDTO.roles( roleSetToRoleDTOSet( user.getRoles() ) );

        return userDTO.build();
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTOBuilder roleDTO = RoleDTO.builder();

        roleDTO.id( role.getId() );
        roleDTO.name( role.getName() );

        return roleDTO.build();
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new HashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }
}
