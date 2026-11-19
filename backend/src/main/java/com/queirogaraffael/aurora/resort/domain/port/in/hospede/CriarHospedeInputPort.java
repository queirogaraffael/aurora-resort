package com.queirogaraffael.aurora.resort.domain.port.in.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;

public interface CriarHospedeInputPort {
    Hospede criarHospede(String cpf, String nome, String dataNascimento, String numeroTelefone);
}
