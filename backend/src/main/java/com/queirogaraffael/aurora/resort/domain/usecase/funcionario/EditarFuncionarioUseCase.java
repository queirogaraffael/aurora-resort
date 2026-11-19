package com.queirogaraffael.aurora.resort.domain.usecase.funcionario;

import com.queirogaraffael.aurora.resort.domain.enums.Turno;
import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import com.queirogaraffael.aurora.resort.domain.port.in.funcionario.BuscarFuncionarioPorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.funcionario.EditarFuncionarioInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.SaveFuncionarioOutputPort;
import org.springframework.transaction.annotation.Transactional;

public class EditarFuncionarioUseCase implements EditarFuncionarioInputPort {

    private final BuscarFuncionarioPorCpfInputPort buscarFuncionarioPorCpfInputPort;
    private final SaveFuncionarioOutputPort saveFuncionarioOutputPort;

    public EditarFuncionarioUseCase(
            BuscarFuncionarioPorCpfInputPort buscarFuncionarioPorCpfInputPort,
            SaveFuncionarioOutputPort saveFuncionarioOutputPort
    ) {
        this.buscarFuncionarioPorCpfInputPort = buscarFuncionarioPorCpfInputPort;
        this.saveFuncionarioOutputPort = saveFuncionarioOutputPort;
    }

    @Override
    @Transactional
    public Funcionario editarFuncionario(String cpf, String nome, String cargo, Turno turno) {
        Funcionario funcionario = buscarFuncionarioPorCpfInputPort.buscarFuncionarioPorCpf(cpf);
        funcionario.setCargo(cargo);
        funcionario.setTurno(turno);
        return saveFuncionarioOutputPort.save(funcionario);
    }
}
