package com.enaa.backend.Auth;

import com.enaa.backend.Enum.Role;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private Role role;
}
