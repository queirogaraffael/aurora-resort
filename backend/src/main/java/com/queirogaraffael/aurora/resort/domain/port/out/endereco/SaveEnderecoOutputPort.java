package com.queirogaraffael.aurora.resort.domain.port.out.endereco;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;

public interface SaveEnderecoOutputPort {
    Endereco save(Endereco endereco);
}
