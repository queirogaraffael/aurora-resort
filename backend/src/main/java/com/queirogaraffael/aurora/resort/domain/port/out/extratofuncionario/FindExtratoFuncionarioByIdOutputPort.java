package com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import java.util.Optional;

public interface FindExtratoFuncionarioByIdOutputPort {
    Optional<ExtratoFuncionario> findById(Long id);
}
