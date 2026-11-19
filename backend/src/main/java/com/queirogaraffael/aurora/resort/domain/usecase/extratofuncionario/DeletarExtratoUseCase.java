package com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario.BuscarExtratoPorIdInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario.DeletarExtratoInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.DeleteExtratoFuncionarioByIdOutputPort;
import org.springframework.transaction.annotation.Transactional;

public class DeletarExtratoUseCase implements DeletarExtratoInputPort {

    private final BuscarExtratoPorIdInputPort buscarExtratoPorIdInputPort;
    private final DeleteExtratoFuncionarioByIdOutputPort deleteExtratoFuncionarioByIdOutputPort;

    public DeletarExtratoUseCase(
            BuscarExtratoPorIdInputPort buscarExtratoPorIdInputPort,
            DeleteExtratoFuncionarioByIdOutputPort deleteExtratoFuncionarioByIdOutputPort
    ) {
        this.buscarExtratoPorIdInputPort = buscarExtratoPorIdInputPort;
        this.deleteExtratoFuncionarioByIdOutputPort = deleteExtratoFuncionarioByIdOutputPort;
    }

    @Override
    @Transactional
    public void deletarExtrato(Long id) {
        buscarExtratoPorIdInputPort.buscarExtratoPorId(id); // garante que existe antes de deletar
        deleteExtratoFuncionarioByIdOutputPort.deleteById(id);
    }
}
