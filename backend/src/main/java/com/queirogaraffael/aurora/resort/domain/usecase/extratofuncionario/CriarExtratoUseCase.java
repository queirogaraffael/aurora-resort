package com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import com.queirogaraffael.aurora.resort.domain.model.Funcionario;
import com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario.CriarExtratoInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.ExisteExtratoDeFuncionarioParaMesOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.SaveExtratoFuncionarioOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.FindComExtratoByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.ExtratoJaExisteParaMesReferenteException;
import com.queirogaraffael.aurora.resort.domain.exception.FuncionarioNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class CriarExtratoUseCase implements CriarExtratoInputPort {

    private final ExisteExtratoDeFuncionarioParaMesOutputPort existeExtratoDeFuncionarioParaMesOutputPort;
    private final FindComExtratoByCpfOutputPort findComExtratoByCpfOutputPort;
    private final SaveExtratoFuncionarioOutputPort saveExtratoFuncionarioOutputPort;

    public CriarExtratoUseCase(
            ExisteExtratoDeFuncionarioParaMesOutputPort existeExtratoDeFuncionarioParaMesOutputPort,
            FindComExtratoByCpfOutputPort findComExtratoByCpfOutputPort,
            SaveExtratoFuncionarioOutputPort saveExtratoFuncionarioOutputPort
    ) {
        this.existeExtratoDeFuncionarioParaMesOutputPort = existeExtratoDeFuncionarioParaMesOutputPort;
        this.findComExtratoByCpfOutputPort = findComExtratoByCpfOutputPort;
        this.saveExtratoFuncionarioOutputPort = saveExtratoFuncionarioOutputPort;
    }

    @Override
    @Transactional
    public ExtratoFuncionario criarExtrato(String cpfFuncionario, Date dataExtrato, double horasTrabalhadas, double valorHora, double salario) {
        if (existeExtratoDeFuncionarioParaMesOutputPort.existeExtratoDeFuncionarioParaMes(cpfFuncionario, dataExtrato)) {
            throw new ExtratoJaExisteParaMesReferenteException("Extrato já existe para o mês referente.");
        }

        Funcionario funcionario = findComExtratoByCpfOutputPort.findComExtratoByCpf(cpfFuncionario)
                .orElseThrow(() -> new FuncionarioNotFoundException("Funcionário com CPF " + cpfFuncionario + " não encontrado."));

        ExtratoFuncionario extrato = ExtratoFuncionario.builder()
                .dataExtrato(dataExtrato)
                .horasTrabalhadas(horasTrabalhadas)
                .valorHora(valorHora)
                .salario(salario)
                .funcionarioId(funcionario.getId())
                .build();

        return saveExtratoFuncionarioOutputPort.save(extrato);
    }
}
