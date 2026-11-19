package com.queirogaraffael.aurora.resort.domain.port.in.funcionario;

import com.queirogaraffael.aurora.resort.domain.enums.Turno;
import com.queirogaraffael.aurora.resort.domain.model.Funcionario;

public interface CriarFuncionarioInputPort {
    Funcionario criarFuncionario(String cpf, String nome, String cargo, Turno turno);
}
