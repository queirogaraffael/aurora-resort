package com.queirogaraffael.aurora.resort.domain.port.in.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;

public interface BuscarEnderecoHospedePorCpfInputPort {
    Endereco buscarEnderecoHospedePorCpf(String cpf);
}
