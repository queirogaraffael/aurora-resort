package com.queirogaraffael.aurora.resort.infrastructure.configs.usecase;

import com.queirogaraffael.aurora.resort.domain.port.in.quarto.BuscarQuartoPorNumeroInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.ExistsQuartoByNumeroOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindByStatusOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindByTipoQuartoAndStatusListOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindByTipoQuartoAndStatusOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindByTipoQuartoOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindOcupadosPorTipoOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindQuartoByNumeroOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.SaveQuartoOutputPort;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.BuscarQuartoPorNumeroUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.BuscarQuartosDisponiveisPorTipoEDataUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.BuscarQuartosPorStatusUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.BuscarQuartosPorTipoEStatusUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.BuscarQuartosPorTipoUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.CriarQuartoUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.EditarQuartoUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.quarto.ModificarStatusQuartoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartoUseCaseConfig {

    @Bean
    public BuscarQuartoPorNumeroUseCase buscarQuartoPorNumeroUseCase(
            FindQuartoByNumeroOutputPort findQuartoByNumeroOutputPort
    ) {
        return new BuscarQuartoPorNumeroUseCase(findQuartoByNumeroOutputPort);
    }

    @Bean
    public BuscarQuartosDisponiveisPorTipoEDataUseCase buscarQuartosDisponiveisPorTipoEDataUseCase(
            FindOcupadosPorTipoOutputPort findOcupadosPorTipoOutputPort,
            FindByTipoQuartoAndStatusListOutputPort findByTipoQuartoAndStatusListOutputPort
    ) {
        return new BuscarQuartosDisponiveisPorTipoEDataUseCase(
                findOcupadosPorTipoOutputPort,
                findByTipoQuartoAndStatusListOutputPort
        );
    }

    @Bean
    public BuscarQuartosPorStatusUseCase buscarQuartosPorStatusUseCase(
            FindByStatusOutputPort findByStatusOutputPort
    ) {
        return new BuscarQuartosPorStatusUseCase(findByStatusOutputPort);
    }

    @Bean
    public BuscarQuartosPorTipoUseCase buscarQuartosPorTipoUseCase(
            FindByTipoQuartoOutputPort findByTipoQuartoOutputPort
    ) {
        return new BuscarQuartosPorTipoUseCase(findByTipoQuartoOutputPort);
    }

    @Bean
    public BuscarQuartosPorTipoEStatusUseCase buscarQuartosPorTipoEStatusUseCase(
            FindByTipoQuartoAndStatusOutputPort findByTipoQuartoAndStatusOutputPort
    ) {
        return new BuscarQuartosPorTipoEStatusUseCase(findByTipoQuartoAndStatusOutputPort);
    }

    @Bean
    public CriarQuartoUseCase criarQuartoUseCase(
            ExistsQuartoByNumeroOutputPort existsQuartoByNumeroOutputPort,
            SaveQuartoOutputPort saveQuartoOutputPort
    ) {
        return new CriarQuartoUseCase(existsQuartoByNumeroOutputPort, saveQuartoOutputPort);
    }

    @Bean
    public EditarQuartoUseCase editarQuartoUseCase(
            BuscarQuartoPorNumeroInputPort buscarQuartoPorNumeroInputPort,
            SaveQuartoOutputPort saveQuartoOutputPort
    ) {
        return new EditarQuartoUseCase(buscarQuartoPorNumeroInputPort, saveQuartoOutputPort);
    }

    @Bean
    public ModificarStatusQuartoUseCase modificarStatusQuartoUseCase(
            BuscarQuartoPorNumeroInputPort buscarQuartoPorNumeroInputPort,
            SaveQuartoOutputPort saveQuartoOutputPort
    ) {
        return new ModificarStatusQuartoUseCase(buscarQuartoPorNumeroInputPort, saveQuartoOutputPort);
    }
}
