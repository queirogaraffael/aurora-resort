package com.queirogaraffael.aurora.resort.infrastructure.configs.usecase;

import com.queirogaraffael.aurora.resort.domain.port.out.user.FindUserByIdOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.user.FindUserByUsernameOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.user.PasswordVerifierOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.user.SaveUserOutputPort;
import com.queirogaraffael.aurora.resort.domain.usecase.user.AutenticarUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.user.BuscarPorUsernameUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.user.BuscarUserPorIdUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.user.RegistrarUsuarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserUseCaseConfig {

    @Bean
    public BuscarPorUsernameUseCase buscarPorUsernameUseCase(
            FindUserByUsernameOutputPort findUserByUsernameOutputPort
    ) {
        return new BuscarPorUsernameUseCase(findUserByUsernameOutputPort);
    }

    @Bean
    public AutenticarUseCase autenticarUseCase(
            FindUserByUsernameOutputPort findUserByUsernameOutputPort,
            PasswordVerifierOutputPort passwordVerifier
    ) {
        return new AutenticarUseCase(findUserByUsernameOutputPort, passwordVerifier);
    }

    @Bean
    public BuscarUserPorIdUseCase buscarUserPorIdUseCase(
            FindUserByIdOutputPort findUserByIdOutputPort
    ) {
        return new BuscarUserPorIdUseCase(findUserByIdOutputPort);
    }

    @Bean
    public RegistrarUsuarioUseCase registrarUsuarioUseCase(
            SaveUserOutputPort saveUserOutputPort,
            PasswordEncoder passwordEncoder
    ) {
        return new RegistrarUsuarioUseCase(saveUserOutputPort, passwordEncoder);
    }
}
