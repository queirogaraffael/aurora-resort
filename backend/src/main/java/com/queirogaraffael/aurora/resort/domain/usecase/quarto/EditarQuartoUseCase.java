package com.queirogaraffael.aurora.resort.domain.usecase.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.BuscarQuartoPorNumeroInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.EditarQuartoInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.SaveQuartoOutputPort;
import org.springframework.transaction.annotation.Transactional;

public class EditarQuartoUseCase implements EditarQuartoInputPort {

    private final BuscarQuartoPorNumeroInputPort buscarQuartoPorNumeroInputPort;
    private final SaveQuartoOutputPort saveQuartoOutputPort;

    public EditarQuartoUseCase(BuscarQuartoPorNumeroInputPort buscarQuartoPorNumeroInputPort, SaveQuartoOutputPort saveQuartoOutputPort) {
        this.buscarQuartoPorNumeroInputPort = buscarQuartoPorNumeroInputPort;
        this.saveQuartoOutputPort = saveQuartoOutputPort;
    }

    @Override
    @Transactional
    public Quarto editarQuarto(String numero, TipoQuarto tipoQuarto, int capacidade, double precoDiaria, StatusQuarto statusQuarto) {
        Quarto quarto = buscarQuartoPorNumeroInputPort.buscarQuartoPorNumero(numero);
        quarto.setTipoQuarto(tipoQuarto);
        quarto.setCapacidade(capacidade);
        quarto.setPrecoDiaria(precoDiaria);
        quarto.setStatusQuarto(statusQuarto);
        return saveQuartoOutputPort.save(quarto);
    }
}
