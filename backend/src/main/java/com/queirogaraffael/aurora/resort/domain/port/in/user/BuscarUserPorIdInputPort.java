package com.queirogaraffael.aurora.resort.domain.port.in.user;

import com.queirogaraffael.aurora.resort.domain.model.User;

import java.util.UUID;

public interface BuscarUserPorIdInputPort {
    User buscarPorId(UUID id);
}
