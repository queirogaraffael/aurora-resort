package com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import java.util.Date;

public interface EditarExtratoInputPort {
    ExtratoFuncionario editarExtrato(Long id, Date dataExtrato, double horasTrabalhadas, double valorHora, double salario);
}
