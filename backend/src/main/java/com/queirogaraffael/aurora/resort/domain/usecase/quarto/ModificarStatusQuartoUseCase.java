package com.queirogaraffael.aurora.resort.domain.usecase.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.BuscarQuartoPorNumeroInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.ModificarStatusQuartoInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.SaveQuartoOutputPort;
import org.springframework.transaction.annotation.Transactional;

public class ModificarStatusQuartoUseCase implements ModificarStatusQuartoInputPort {

    private final BuscarQuartoPorNumeroInputPort buscarQuartoPorNumeroInputPort;
    private final SaveQuartoOutputPort saveQuartoOutputPort;

    public ModificarStatusQuartoUseCase(BuscarQuartoPorNumeroInputPort buscarQuartoPorNumeroInputPort, SaveQuartoOutputPort saveQuartoOutputPort) {
        this.buscarQuartoPorNumeroInputPort = buscarQuartoPorNumeroInputPort;
        this.saveQuartoOutputPort = saveQuartoOutputPort;
    }

    @Override
    @Transactional
    public Quarto modificarStatusQuarto(String numero, StatusQuarto statusQuarto) {
        Quarto quarto = buscarQuartoPorNumeroInputPort.buscarQuartoPorNumero(numero);
        quarto.setStatusQuarto(statusQuarto);
        return saveQuartoOutputPort.save(quarto);
    }
}
