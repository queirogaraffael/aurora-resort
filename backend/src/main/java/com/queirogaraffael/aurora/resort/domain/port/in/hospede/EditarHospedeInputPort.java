package com.queirogaraffael.aurora.resort.domain.port.in.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;

public interface EditarHospedeInputPort {
    Hospede editarHospede(String cpf, String nome, String dataNascimento, String numeroTelefone);
}
