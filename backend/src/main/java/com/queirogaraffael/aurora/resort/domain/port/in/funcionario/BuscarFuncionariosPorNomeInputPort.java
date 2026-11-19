package com.queirogaraffael.aurora.resort.domain.port.in.funcionario;

import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BuscarFuncionariosPorNomeInputPort {
    Page<Funcionario> buscarFuncionariosPorNome(String nome, Pageable pageable);
}
