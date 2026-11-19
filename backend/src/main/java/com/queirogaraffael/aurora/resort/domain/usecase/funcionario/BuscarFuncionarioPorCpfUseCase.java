package com.queirogaraffael.aurora.resort.domain.usecase.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import com.queirogaraffael.aurora.resort.domain.port.in.funcionario.BuscarFuncionarioPorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.FindFuncionarioByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.FuncionarioNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class BuscarFuncionarioPorCpfUseCase implements BuscarFuncionarioPorCpfInputPort {

    private final FindFuncionarioByCpfOutputPort findFuncionarioByCpfOutputPort;

    public BuscarFuncionarioPorCpfUseCase(FindFuncionarioByCpfOutputPort findFuncionarioByCpfOutputPort) {
        this.findFuncionarioByCpfOutputPort = findFuncionarioByCpfOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Funcionario buscarFuncionarioPorCpf(String cpf) {
        return findFuncionarioByCpfOutputPort.findByCpf(cpf)
                .orElseThrow(() -> new FuncionarioNotFoundException("Funcionário com CPF " + cpf + " não encontrado."));
    }
}
