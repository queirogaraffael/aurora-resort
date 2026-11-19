package com.queirogaraffael.aurora.resort.domain.port.in.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;

public interface ModificarStatusQuartoInputPort {
    Quarto modificarStatusQuarto(String numero, StatusQuarto statusQuarto);
}
