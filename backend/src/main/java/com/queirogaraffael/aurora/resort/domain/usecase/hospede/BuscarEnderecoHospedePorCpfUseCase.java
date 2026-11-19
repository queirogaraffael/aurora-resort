package com.queirogaraffael.aurora.resort.domain.usecase.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.BuscarEnderecoHospedePorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.GetEnderecoHospedeByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.EnderecoNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class BuscarEnderecoHospedePorCpfUseCase implements BuscarEnderecoHospedePorCpfInputPort {

    private final GetEnderecoHospedeByCpfOutputPort getEnderecoHospedeByCpfOutputPort;

    public BuscarEnderecoHospedePorCpfUseCase(GetEnderecoHospedeByCpfOutputPort getEnderecoHospedeByCpfOutputPort) {
        this.getEnderecoHospedeByCpfOutputPort = getEnderecoHospedeByCpfOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Endereco buscarEnderecoHospedePorCpf(String cpf) {
        return getEnderecoHospedeByCpfOutputPort.getEnderecoHospedeByCpf(cpf)
                .orElseThrow(() -> new EnderecoNotFoundException("Hóspede sem endereço cadastrado."));
    }
}
