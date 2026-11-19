package com.queirogaraffael.aurora.resort.domain.usecase.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;
import com.queirogaraffael.aurora.resort.domain.port.in.funcionario.BuscarEnderecoFuncionarioPorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.GetEnderecoFuncionarioByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.EnderecoNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class BuscarEnderecoFuncionarioPorCpfUseCase implements BuscarEnderecoFuncionarioPorCpfInputPort {

    private final GetEnderecoFuncionarioByCpfOutputPort getEnderecoFuncionarioByCpfOutputPort;

    public BuscarEnderecoFuncionarioPorCpfUseCase(GetEnderecoFuncionarioByCpfOutputPort getEnderecoFuncionarioByCpfOutputPort) {
        this.getEnderecoFuncionarioByCpfOutputPort = getEnderecoFuncionarioByCpfOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Endereco buscarEnderecoFuncionarioPorCpf(String cpf) {
        return getEnderecoFuncionarioByCpfOutputPort.getEnderecoFuncionarioByCpf(cpf)
                .orElseThrow(() -> new EnderecoNotFoundException("Funcionário sem endereço cadastrado."));
    }
}
