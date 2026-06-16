package com.barbearia.agendamento.controller;

import com.barbearia.agendamento.model.Agendamento;
import com.barbearia.agendamento.service.AgendamentoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    private AgendamentoService agendamentoService = new AgendamentoService();

    @GetMapping("/")
    public String hello() {
        return "Servidor da barbearia funcionando!";
    }

    @PostMapping("/api/agendamento")
    public Agendamento criarAgendamentoTeste(@RequestBody Agendamento agendamento) {
        return agendamentoService.criarAgendamento(agendamento);
    }
    @GetMapping("api/agendamentos")
    public List<Agendamento>listarAgendamentos() {
        return agendamentoService.listarAgendamentos();

    }
    }

