package com.queirogaraffael.aurora.resort.domain.port.in.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;

public interface BuscarHospedePorCpfInputPort {
    Hospede buscarHospedePorCpf(String cpf);
}
