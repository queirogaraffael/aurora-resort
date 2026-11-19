package com.queirogaraffael.aurora.resort.domain.model;

import com.queirogaraffael.aurora.resort.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private UUID id;
    private String username;
    private String password;
    private String cpf;
    private LocalDate dataNascimento;
    private String nome;
    private String email;
    private String telefone;
    private UserRole userRole;
    private Endereco endereco;
}
