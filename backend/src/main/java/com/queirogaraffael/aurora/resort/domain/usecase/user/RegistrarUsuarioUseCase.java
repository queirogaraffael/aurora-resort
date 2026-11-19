package com.queirogaraffael.aurora.resort.domain.usecase.user;

import com.queirogaraffael.aurora.resort.domain.enums.Turno;
import com.queirogaraffael.aurora.resort.domain.enums.UserRole;
import com.queirogaraffael.aurora.resort.domain.model.User;
import com.queirogaraffael.aurora.resort.domain.port.in.user.RegistrarUsuarioInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.user.SaveUserOutputPort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public class RegistrarUsuarioUseCase implements RegistrarUsuarioInputPort {

    private final SaveUserOutputPort saveUserOutputPort;
    private final PasswordEncoder passwordEncoder;

    public RegistrarUsuarioUseCase(SaveUserOutputPort saveUserOutputPort, PasswordEncoder passwordEncoder) {
        this.saveUserOutputPort = saveUserOutputPort;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public User registrarUsuario(UserRole role, String username, String password, String nome,
                                 String email, String telefone, String cpf, LocalDate dataNascimento,
                                 String cargo, Turno turno) {
        User user = User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .nome(nome)
                .email(email)
                .telefone(telefone)
                .cpf(cpf)
                .dataNascimento(dataNascimento)
                .userRole(role)
                .build();
        return saveUserOutputPort.save(user);
    }
}
