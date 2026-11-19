package com.queirogaraffael.aurora.resort.domain.port.out.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import java.util.List;

public interface FindByTipoQuartoAndStatusListOutputPort {
    List<Quarto> findByTipoQuartoAndStatusList(TipoQuarto tipoQuarto, StatusQuarto status);
}
