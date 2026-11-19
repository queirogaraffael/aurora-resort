package com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BuscarExtratosPorCpfInputPort {
    Page<ExtratoFuncionario> buscarExtratosPorCpf(String cpf, Pageable pageable);
}
