package com.queirogaraffael.aurora.resort.domain.port.in.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;

public interface CriarQuartoInputPort {
    Quarto criarQuarto(String numero, TipoQuarto tipoQuarto, int capacidade, double precoDiaria, StatusQuarto statusQuarto);
}
