package com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario.BuscarExtratosPorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.FindByCpfFuncionarioOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class BuscarExtratosPorCpfUseCase implements BuscarExtratosPorCpfInputPort {

    private final FindByCpfFuncionarioOutputPort findByCpfFuncionarioOutputPort;

    public BuscarExtratosPorCpfUseCase(FindByCpfFuncionarioOutputPort findByCpfFuncionarioOutputPort) {
        this.findByCpfFuncionarioOutputPort = findByCpfFuncionarioOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ExtratoFuncionario> buscarExtratosPorCpf(String cpf, Pageable pageable) {
        return findByCpfFuncionarioOutputPort.findByCpfFuncionario(cpf, pageable);
    }
}
