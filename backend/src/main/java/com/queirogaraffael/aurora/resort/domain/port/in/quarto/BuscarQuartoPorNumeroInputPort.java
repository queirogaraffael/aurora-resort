package com.queirogaraffael.aurora.resort.domain.port.in.quarto;

import com.queirogaraffael.aurora.resort.domain.model.Quarto;

public interface BuscarQuartoPorNumeroInputPort {
    Quarto buscarQuartoPorNumero(String numero);
}
