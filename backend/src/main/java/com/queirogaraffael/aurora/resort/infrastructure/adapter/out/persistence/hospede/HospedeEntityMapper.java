package com.queirogaraffael.aurora.resort.infrastructure.adapter.out.persistence.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;
import com.queirogaraffael.aurora.resort.infrastructure.adapter.out.persistence.user.UserEntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserEntityMapper.class})
public interface HospedeEntityMapper {

    @Mapping(target = "reservas", ignore = true)
    HospedeEntity toEntity(Hospede domain);

    Hospede toDomain(HospedeEntity entity);
}
