package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.funcionario;

import com.queirogaraffael.aurora.resort.domain.enums.Turno;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioUpdateDTO {

    @NotBlank(message = "O cargo não pode estar em branco")
    private String cargo;

    @NotNull(message = "O turno não pode ser nulo")
    private Turno turno;
}
