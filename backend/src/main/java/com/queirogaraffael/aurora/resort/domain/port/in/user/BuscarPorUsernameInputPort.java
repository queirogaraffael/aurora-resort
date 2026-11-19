package com.queirogaraffael.aurora.resort.domain.port.in.user;

import com.queirogaraffael.aurora.resort.domain.model.User;

public interface BuscarPorUsernameInputPort {
    User buscarPorUsername(String username);
}
