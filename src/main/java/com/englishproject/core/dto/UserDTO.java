package com.englishproject.core.dto;

import com.englishproject.core.model.Role;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private Set<RoleDTO> roles;
}
