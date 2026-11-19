package com.queirogaraffael.aurora.resort.domain.port.out.user;

import com.queirogaraffael.aurora.resort.domain.model.User;

public interface SaveUserOutputPort {
    User save(User user);
}
