package com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import java.util.Date;

public interface CriarExtratoInputPort {
    ExtratoFuncionario criarExtrato(String cpfFuncionario, Date dataExtrato, double horasTrabalhadas, double valorHora, double salario);
}
