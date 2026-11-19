package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.user;

import com.queirogaraffael.aurora.resort.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    private UUID id;
    private String username;
    private String cpf;
    private LocalDate dataNascimento;
    private String nome;
    private String email;
    private String telefone;
    private UserRole userRole;
}
