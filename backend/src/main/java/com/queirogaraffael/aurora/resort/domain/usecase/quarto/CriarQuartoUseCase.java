package com.queirogaraffael.aurora.resort.domain.usecase.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.CriarQuartoInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.ExistsQuartoByNumeroOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.SaveQuartoOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.QuartoJaExisteException;
import org.springframework.transaction.annotation.Transactional;

public class CriarQuartoUseCase implements CriarQuartoInputPort {

    private final ExistsQuartoByNumeroOutputPort existsQuartoByNumeroOutputPort;
    private final SaveQuartoOutputPort saveQuartoOutputPort;

    public CriarQuartoUseCase(ExistsQuartoByNumeroOutputPort existsQuartoByNumeroOutputPort, SaveQuartoOutputPort saveQuartoOutputPort) {
        this.existsQuartoByNumeroOutputPort = existsQuartoByNumeroOutputPort;
        this.saveQuartoOutputPort = saveQuartoOutputPort;
    }

    @Override
    @Transactional
    public Quarto criarQuarto(String numero, TipoQuarto tipoQuarto, int capacidade, double precoDiaria, StatusQuarto statusQuarto) {
        if (existsQuartoByNumeroOutputPort.existsByNumero(numero)) {
            throw new QuartoJaExisteException("Quarto já cadastrado com esse número.");
        }
        Quarto quarto = Quarto.builder()
                .numero(numero)
                .tipoQuarto(tipoQuarto)
                .capacidade(capacidade)
                .precoDiaria(precoDiaria)
                .statusQuarto(statusQuarto)
                .build();
        return saveQuartoOutputPort.save(quarto);
    }
}
