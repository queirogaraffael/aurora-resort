package com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindByCpfFuncionarioOutputPort {
    Page<ExtratoFuncionario> findByCpfFuncionario(String cpf, Pageable pageable);
}
