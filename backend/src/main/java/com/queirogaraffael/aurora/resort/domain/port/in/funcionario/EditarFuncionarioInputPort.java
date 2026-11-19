package com.queirogaraffael.aurora.resort.domain.port.in.funcionario;

import com.queirogaraffael.aurora.resort.domain.enums.Turno;
import com.queirogaraffael.aurora.resort.domain.model.Funcionario;

public interface EditarFuncionarioInputPort {
    Funcionario editarFuncionario(String cpf, String nome, String cargo, Turno turno);
}
