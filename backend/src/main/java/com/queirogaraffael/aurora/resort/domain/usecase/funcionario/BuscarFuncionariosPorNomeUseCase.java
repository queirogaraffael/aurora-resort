package com.queirogaraffael.aurora.resort.domain.usecase.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import com.queirogaraffael.aurora.resort.domain.port.in.funcionario.BuscarFuncionariosPorNomeInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.FindFuncionarioByNomeOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class BuscarFuncionariosPorNomeUseCase implements BuscarFuncionariosPorNomeInputPort {

    private final FindFuncionarioByNomeOutputPort findFuncionarioByNomeOutputPort;

    public BuscarFuncionariosPorNomeUseCase(FindFuncionarioByNomeOutputPort findFuncionarioByNomeOutputPort) {
        this.findFuncionarioByNomeOutputPort = findFuncionarioByNomeOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Funcionario> buscarFuncionariosPorNome(String nome, Pageable pageable) {
        return findFuncionarioByNomeOutputPort.findByNome(nome, pageable);
    }
}
