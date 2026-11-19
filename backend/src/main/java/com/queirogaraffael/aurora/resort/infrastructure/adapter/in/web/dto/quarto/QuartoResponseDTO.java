package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuartoResponseDTO {
    private Long id;
    private String numero;
    private TipoQuarto tipoQuarto;
    private int capacidade;
    private double precoDiaria;
    private StatusQuarto statusQuarto;
}
