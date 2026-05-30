package com.barbearia.agendamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.barbearia.agendamento.model.Agendamento;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Servidor da barbearia funcionando!";
    }
    @GetMapping("/api/agendamento")
    public Agendamento criarAgendamentoTeste() {
    }


    Agendamento agendamento = new Agendamento();

agendamento.setnomeCliente("Juan");

agendamento.setnomeBarbeiro("Felipe");

agendamento.setData("2026-05-28");

agendamento.setHorario("14:00");

agendamento.setStatus("AGENDADO");

return "Cliente: " + agendamento.getNomeCliente()
        + " | Barbeiro: " + agendamento.getNomeBarbeiro();

    }
}