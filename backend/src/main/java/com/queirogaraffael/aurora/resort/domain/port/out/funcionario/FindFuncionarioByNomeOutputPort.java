package com.queirogaraffael.aurora.resort.domain.port.out.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindFuncionarioByNomeOutputPort {
    Page<Funcionario> findByNome(String nome, Pageable pageable);
}
