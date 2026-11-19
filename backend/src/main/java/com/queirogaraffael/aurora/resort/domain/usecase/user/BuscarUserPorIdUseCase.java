package com.queirogaraffael.aurora.resort.domain.usecase.user;

import com.queirogaraffael.aurora.resort.domain.exception.UserNotFoundException;
import com.queirogaraffael.aurora.resort.domain.model.User;
import com.queirogaraffael.aurora.resort.domain.port.in.user.BuscarUserPorIdInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.user.FindUserByIdOutputPort;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class BuscarUserPorIdUseCase implements BuscarUserPorIdInputPort {

    private final FindUserByIdOutputPort findUserByIdOutputPort;

    public BuscarUserPorIdUseCase(FindUserByIdOutputPort findUserByIdOutputPort) {
        this.findUserByIdOutputPort = findUserByIdOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public User buscarPorId(UUID id) {
        return findUserByIdOutputPort.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuário com id '" + id + "' não encontrado."));
    }
}
