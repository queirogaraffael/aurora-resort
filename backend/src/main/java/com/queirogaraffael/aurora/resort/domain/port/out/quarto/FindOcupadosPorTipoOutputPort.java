package com.queirogaraffael.aurora.resort.domain.port.out.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusReserva;
import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import java.util.Date;
import java.util.List;

public interface FindOcupadosPorTipoOutputPort {
    List<Quarto> findOcupadosPorTipo(TipoQuarto tipoQuarto, Date dataInicial, Date dataFinal, List<StatusReserva> statusReservas);
}
