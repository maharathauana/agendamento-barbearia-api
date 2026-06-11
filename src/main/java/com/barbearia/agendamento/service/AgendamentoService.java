package com.barbearia.agendamento.service;
import com.barbearia.agendamento.enums.StatusAgendamento;
import com.barbearia.agendamento.model.Agendamento;
import java.util.ArrayList;
import java.util.List;

    public class AgendamentoService {
        private List<Agendamento> agendamentos = new ArrayList<>();
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

