package com.barbearia.agendamento.model;

public class Agendamento {

    private String nomeCliente;

    private String nomeBarbeiro;

    private String data;

    private String horario;

    private String status;

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
    public String getStatus() {
        return status;
    }
        public void setStatus (String status){
            this.status = status;
        }


}