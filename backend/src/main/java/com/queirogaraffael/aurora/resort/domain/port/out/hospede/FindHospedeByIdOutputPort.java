package com.queirogaraffael.aurora.resort.domain.port.out.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;
import java.util.Optional;

public interface FindHospedeByIdOutputPort {
    Optional<Hospede> findById(Long id);
}
