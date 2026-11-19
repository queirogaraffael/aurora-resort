package com.queirogaraffael.aurora.resort.domain.port.out.user;

import com.queirogaraffael.aurora.resort.domain.model.User;
import java.util.Optional;

public interface FindUserByUsernameOutputPort {
    Optional<User> findByUsername(String username);
}
