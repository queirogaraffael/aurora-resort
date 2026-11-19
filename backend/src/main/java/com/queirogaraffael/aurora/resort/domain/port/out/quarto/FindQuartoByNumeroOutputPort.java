package com.queirogaraffael.aurora.resort.domain.port.out.quarto;

import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import java.util.Optional;

public interface FindQuartoByNumeroOutputPort {
    Optional<Quarto> findByNumero(String numero);
}
