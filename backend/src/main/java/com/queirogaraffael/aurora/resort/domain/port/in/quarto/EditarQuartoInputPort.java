package com.queirogaraffael.aurora.resort.domain.port.in.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;

public interface EditarQuartoInputPort {
    Quarto editarQuarto(String numero, TipoQuarto tipoQuarto, int capacidade, double precoDiaria, StatusQuarto statusQuarto);
}
