package com.queirogaraffael.aurora.resort.domain.usecase.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.BuscarHospedePorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.EditarHospedeInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.SaveHospedeOutputPort;
import org.springframework.transaction.annotation.Transactional;

public class EditarHospedeUseCase implements EditarHospedeInputPort {

    private final BuscarHospedePorCpfInputPort buscarHospedePorCpfInputPort;
    private final SaveHospedeOutputPort saveHospedeOutputPort;

    public EditarHospedeUseCase(
            BuscarHospedePorCpfInputPort buscarHospedePorCpfInputPort,
            SaveHospedeOutputPort saveHospedeOutputPort
    ) {
        this.buscarHospedePorCpfInputPort = buscarHospedePorCpfInputPort;
        this.saveHospedeOutputPort = saveHospedeOutputPort;
    }

    @Override
    @Transactional
    public Hospede editarHospede(String cpf, String nome, String dataNascimento, String numeroTelefone) {
        Hospede hospede = buscarHospedePorCpfInputPort.buscarHospedePorCpf(cpf);
        // dados pessoais ficam em User; o serviço de User é responsável por isso
        return saveHospedeOutputPort.save(hospede);
    }
}
