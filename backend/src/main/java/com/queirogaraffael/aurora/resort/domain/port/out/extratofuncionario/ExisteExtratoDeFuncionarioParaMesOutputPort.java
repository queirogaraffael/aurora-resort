package com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario;

import java.util.Date;

public interface ExisteExtratoDeFuncionarioParaMesOutputPort {
    boolean existeExtratoDeFuncionarioParaMes(String funcionarioCpf, Date dataExtrato);
}
