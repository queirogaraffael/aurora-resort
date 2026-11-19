package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.user;

import com.queirogaraffael.aurora.resort.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserContextDTO {
    private UUID id;
    private String nome;
    private String username;
    private String email;
    private UserRole userRole;
}
