package com.barbearia.agendamento.model;

import com.barbearia.agendamento.enums.StatusAgendamento;
import java.time.LocalDate;

public class Agendamento {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private String nomeCliente;

    private String nomeBarbeiro;

    private LocalDate data;

    private String horario;

    private StatusAgendamento status;

    public String getNomeCliente() {
        return nomeCliente;
    }
        public void setNomeCliente (String nomeCliente){
            this.nomeCliente = nomeCliente;
        }


    public String getNomeBarbeiro() { return nomeBarbeiro;}
        public void setNomeBarbeiro (String nomeBarbeiro){
            this.nomeBarbeiro = nomeBarbeiro;
        }

    public LocalDate getData() {
        return data;
    }
public void setData(LocalDate data){
        this.data = data;
}
    public String getHorario() {
        return horario;
    }
        public void setHorario (String horario){
            this.horario = horario;
        }
    public StatusAgendamento getStatus() {

        return status;
    }
        public void setStatus (StatusAgendamento status){
            this.status = status;
        }



}