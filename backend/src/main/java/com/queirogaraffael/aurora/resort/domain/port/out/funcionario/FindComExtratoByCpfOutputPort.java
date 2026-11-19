package com.queirogaraffael.aurora.resort.domain.port.out.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import java.util.Optional;

public interface FindComExtratoByCpfOutputPort {
    Optional<Funcionario> findComExtratoByCpf(String cpf);
}
