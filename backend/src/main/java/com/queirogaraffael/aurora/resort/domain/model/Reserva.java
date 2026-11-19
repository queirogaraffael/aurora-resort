package com.queirogaraffael.aurora.resort.domain.model;

import com.queirogaraffael.aurora.resort.domain.enums.StatusReserva;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reserva {

    @EqualsAndHashCode.Include
    private Long id;

    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private Integer numeroHospedes;
    private StatusReserva statusReserva;
    private Double valorTotal;

    private Quarto quarto;
    private Hospede hospede;
}
