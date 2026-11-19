package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.mapper;

import com.queirogaraffael.aurora.resort.domain.model.ExtratoFuncionario;
import com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.extratofuncionario.ExtratoFuncionarioResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExtratoFuncionarioWebMapper {

    ExtratoFuncionarioResponseDTO toResponse(ExtratoFuncionario domain);
}
