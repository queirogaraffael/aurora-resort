package com.queirogaraffael.aurora.resort.domain.port.in.endereco;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;

public interface ModificarEnderecoInputPort {
    Endereco modificarEndereco(Long id, Endereco enderecoModificado);
}
