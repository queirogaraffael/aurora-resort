package com.queirogaraffael.aurora.resort.domain.port.in.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;

public interface BuscarFuncionarioPorCpfInputPort {
    Funcionario buscarFuncionarioPorCpf(String cpf);
}
