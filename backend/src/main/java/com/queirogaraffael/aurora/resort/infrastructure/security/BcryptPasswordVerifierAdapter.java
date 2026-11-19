package com.queirogaraffael.aurora.resort.infrastructure.security;

import com.queirogaraffael.aurora.resort.domain.port.out.user.PasswordVerifierOutputPort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BcryptPasswordVerifierAdapter implements PasswordVerifierOutputPort {

    private final PasswordEncoder passwordEncoder;

    public BcryptPasswordVerifierAdapter(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean matches(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
