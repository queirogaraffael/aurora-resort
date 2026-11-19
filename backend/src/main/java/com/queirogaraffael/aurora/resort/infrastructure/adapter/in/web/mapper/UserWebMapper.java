package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.mapper;

import com.queirogaraffael.aurora.resort.domain.model.User;
import com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.dto.user.UserResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserWebMapper {

    UserResponseDTO toResponse(User domain);
}
