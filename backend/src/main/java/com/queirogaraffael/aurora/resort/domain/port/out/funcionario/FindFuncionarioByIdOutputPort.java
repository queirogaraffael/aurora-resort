package com.queirogaraffael.aurora.resort.domain.port.out.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import java.util.Optional;

public interface FindFuncionarioByIdOutputPort {
    Optional<Funcionario> findById(Long id);
}
