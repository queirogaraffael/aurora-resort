package com.queirogaraffael.aurora.resort.domain.port.out.user;

import com.queirogaraffael.aurora.resort.domain.model.User;

import java.util.Optional;
import java.util.UUID;

public interface FindUserByIdOutputPort {
    Optional<User> findById(UUID id);
}
