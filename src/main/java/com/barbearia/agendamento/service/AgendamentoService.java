package com.barbearia.agendamento.service;
import com.barbearia.agendamento.enums.StatusAgendamento;
import com.barbearia.agendamento.model.Agendamento;
public class AgendamentoService {
    public Agendamento criarAgendamento() {
        Agendamento agendamento = new Agendamento();
        agendamento.setNomeCliente("Juan");
        agendamento.setNomeBarbeiro("Felipe");
        agendamento.setData("2026-05-28");
        agendamento.setHorario("14:00");
        agendamento.setStatus(StatusAgendamento.AGENDADO);

        return agendamento;

    }
}
