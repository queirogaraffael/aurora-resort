package com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;

public interface BuscarExtratoPorIdInputPort {
    ExtratoFuncionario buscarExtratoPorId(Long id);
}
