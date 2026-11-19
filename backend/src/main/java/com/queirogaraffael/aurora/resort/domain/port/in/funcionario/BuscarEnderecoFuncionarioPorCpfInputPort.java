package com.queirogaraffael.aurora.resort.domain.port.in.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;

public interface BuscarEnderecoFuncionarioPorCpfInputPort {
    Endereco buscarEnderecoFuncionarioPorCpf(String cpf);
}
