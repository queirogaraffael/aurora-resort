package com.queirogaraffael.aurora.resort.domain.usecase.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.BuscarHospedePorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.CriarHospedeInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.FindHospedeByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.HospedeJaExisteException;
import com.queirogaraffael.aurora.resort.domain.exception.HospedeNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class CriarHospedeUseCase implements CriarHospedeInputPort {

    private final FindHospedeByCpfOutputPort findHospedeByCpfOutputPort;

    public CriarHospedeUseCase(FindHospedeByCpfOutputPort findHospedeByCpfOutputPort) {
        this.findHospedeByCpfOutputPort = findHospedeByCpfOutputPort;
    }

    @Override
    @Transactional
    public Hospede criarHospede(String cpf, String nome, String dataNascimento, String numeroTelefone) {
        if (findHospedeByCpfOutputPort.findByCpf(cpf).isPresent()) {
            throw new HospedeJaExisteException("Hóspede com este CPF já existe!");
        }
        // A criação do Hospede passa pelo User — será orquestrada pelo UserService na Fase 4
        // Por hora, busca o hospede existente associado ao User já criado
        return findHospedeByCpfOutputPort.findByCpf(cpf)
                .orElseThrow(() -> new HospedeNotFoundException("Hóspede com CPF " + cpf + " não encontrado."));
    }
}
