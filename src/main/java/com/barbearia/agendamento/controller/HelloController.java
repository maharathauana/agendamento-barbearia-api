package com.barbearia.agendamento.controller;

import com.barbearia.agendamento.model.Agendamento;
import com.barbearia.agendamento.service.AgendamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private AgendamentoService agendamentoService = new AgendamentoService();

    @GetMapping("/")
    public String hello() {
        return "Servidor da barbearia funcionando!";
    }

    @GetMapping("/api/agendamento")
    public Agendamento criarAgendamentoTeste() {
        return agendamentoService.criarAgendamento();
    }
}