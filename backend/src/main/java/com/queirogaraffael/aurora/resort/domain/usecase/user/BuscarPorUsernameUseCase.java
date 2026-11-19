package com.queirogaraffael.aurora.resort.domain.usecase.user;

import com.queirogaraffael.aurora.resort.domain.model.User;
import com.queirogaraffael.aurora.resort.domain.port.in.user.BuscarPorUsernameInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.user.FindUserByUsernameOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.UserNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class BuscarPorUsernameUseCase implements BuscarPorUsernameInputPort {

    private final FindUserByUsernameOutputPort findUserByUsernameOutputPort;

    public BuscarPorUsernameUseCase(FindUserByUsernameOutputPort findUserByUsernameOutputPort) {
        this.findUserByUsernameOutputPort = findUserByUsernameOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public User buscarPorUsername(String username) {
        return findUserByUsernameOutputPort.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("Usuário '" + username + "' não encontrado."));
    }
}
