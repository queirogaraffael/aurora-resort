package com.queirogaraffael.aurora.resort.domain.port.in.user;

import com.queirogaraffael.aurora.resort.domain.enums.Turno;
import com.queirogaraffael.aurora.resort.domain.enums.UserRole;
import com.queirogaraffael.aurora.resort.domain.model.User;
import java.time.LocalDate;

public interface RegistrarUsuarioInputPort {
    User registrarUsuario(UserRole role, String username, String password, String nome,
                           String email, String telefone, String cpf, LocalDate dataNascimento,
                           String cargo, Turno turno);
}
