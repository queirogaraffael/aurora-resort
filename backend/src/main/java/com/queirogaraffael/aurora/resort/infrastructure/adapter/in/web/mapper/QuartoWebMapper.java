package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.mapper;

import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.quarto.QuartoResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuartoWebMapper {

    QuartoResponseDTO toResponse(Quarto domain);
}
