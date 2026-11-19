package com.queirogaraffael.aurora.resort.domain.port.in.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import java.time.LocalDateTime;

public interface CriarReservaInputPort {
    Reserva criarReserva(String cpfHospede, String numeroQuarto, LocalDateTime dataEntrada, LocalDateTime dataSaida, Integer numeroHospedes);
}
