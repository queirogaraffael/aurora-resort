package com.queirogaraffael.aurora.resort.domain.port.out.user;

public interface ExistsUserByUsernameOutputPort {
    boolean existsByUsername(String username);
}
