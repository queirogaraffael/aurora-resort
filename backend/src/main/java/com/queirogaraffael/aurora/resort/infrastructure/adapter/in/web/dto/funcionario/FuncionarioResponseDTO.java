package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.funcionario;

import com.queirogaraffael.aurora.resort.domain.enums.Turno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioResponseDTO {
    private Long id;
    private String cargo;
    private Turno turno;
    private String cpf;
    private String nome;
}
