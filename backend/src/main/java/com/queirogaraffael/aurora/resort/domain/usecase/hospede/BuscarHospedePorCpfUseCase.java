package com.queirogaraffael.aurora.resort.domain.usecase.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.BuscarHospedePorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.FindHospedeByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.HospedeNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class BuscarHospedePorCpfUseCase implements BuscarHospedePorCpfInputPort {

    private final FindHospedeByCpfOutputPort findHospedeByCpfOutputPort;

    public BuscarHospedePorCpfUseCase(FindHospedeByCpfOutputPort findHospedeByCpfOutputPort) {
        this.findHospedeByCpfOutputPort = findHospedeByCpfOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Hospede buscarHospedePorCpf(String cpf) {
        return findHospedeByCpfOutputPort.findByCpf(cpf)
                .orElseThrow(() -> new HospedeNotFoundException("Hóspede com CPF " + cpf + " não encontrado."));
    }
}
