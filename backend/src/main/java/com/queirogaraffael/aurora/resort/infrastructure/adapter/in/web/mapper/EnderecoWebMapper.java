package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.mapper;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;
import com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.endereco.EnderecoRequestDTO;
import com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.endereco.EnderecoResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoWebMapper {

    Endereco toDomain(EnderecoRequestDTO dto);

    EnderecoResponseDTO toResponse(Endereco domain);
}
