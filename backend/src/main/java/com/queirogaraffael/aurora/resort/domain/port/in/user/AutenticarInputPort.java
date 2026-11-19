package com.queirogaraffael.aurora.resort.domain.port.in.user;

import com.queirogaraffael.aurora.resort.domain.model.User;

public interface AutenticarInputPort {
    User autenticar(String username, String password);
}
