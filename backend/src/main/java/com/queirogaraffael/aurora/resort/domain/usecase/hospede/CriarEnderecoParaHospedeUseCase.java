package com.queirogaraffael.aurora.resort.domain.usecase.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;
import com.queirogaraffael.aurora.resort.domain.model.Hospede;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.BuscarHospedePorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.hospede.CriarEnderecoParaHospedeInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.SaveEnderecoOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.SaveHospedeOutputPort;
import org.springframework.transaction.annotation.Transactional;

public class CriarEnderecoParaHospedeUseCase implements CriarEnderecoParaHospedeInputPort {

    private final BuscarHospedePorCpfInputPort buscarHospedePorCpfInputPort;
    private final SaveEnderecoOutputPort saveEnderecoOutputPort;
    private final SaveHospedeOutputPort saveHospedeOutputPort;

    public CriarEnderecoParaHospedeUseCase(
            BuscarHospedePorCpfInputPort buscarHospedePorCpfInputPort,
            SaveEnderecoOutputPort saveEnderecoOutputPort,
            SaveHospedeOutputPort saveHospedeOutputPort
    ) {
        this.buscarHospedePorCpfInputPort = buscarHospedePorCpfInputPort;
        this.saveEnderecoOutputPort = saveEnderecoOutputPort;
        this.saveHospedeOutputPort = saveHospedeOutputPort;
    }

    @Override
    @Transactional
    public Endereco criarEnderecoParaHospede(String cpf, Endereco endereco) {
        Hospede hospede = buscarHospedePorCpfInputPort.buscarHospedePorCpf(cpf);
        Endereco enderecoSalvo = saveEnderecoOutputPort.save(endereco);
        hospede.getUser().setEndereco(enderecoSalvo);
        saveHospedeOutputPort.save(hospede);
        return enderecoSalvo;
    }
}
