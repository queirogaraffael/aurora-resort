package com.queirogaraffael.aurora.resort.domain.port.out.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;

public interface SaveFuncionarioOutputPort {
    Funcionario save(Funcionario funcionario);
}
