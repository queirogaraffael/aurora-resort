package com.queirogaraffael.aurora.resort.domain.port.out.endereco;

import com.queirogaraffael.aurora.resort.domain.model.Endereco;
import java.util.Optional;

public interface GetEnderecoFuncionarioByCpfOutputPort {
    Optional<Endereco> getEnderecoFuncionarioByCpf(String cpf);
}
