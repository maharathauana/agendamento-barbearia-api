package com.barbearia.agendamento.model;

import com.barbearia.agendamento.enums.StatusAgendamento;

public class Agendamento {

    private String nomeCliente;

    private String nomeBarbeiro;

    private String data;

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

    public String getData() {
        return data;
    }
        public void setData (String data){
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