package com.barbearia.agendamento.model;

public class Agendamento {

    private String nomeCliente;

    private String nomeBarbeiro;

    private String data;

    private String horario;

    private String status;

    public String getnomeCliente() {
        return nomeCliente;
    }
        public void setNomeCliente (String nomeCliente){
            this.nomeCliente = nomeCliente;
        }


    public String getNomeBarbeiro() {
        return nomeBarbeiro;
    }
        public void setNomeBarbeiro (String nomeBarbeiro){
            this.nomeBarbeiro = nomeBarbeiro;
        }

    public String getData() {
        return data;
    }
        public void setData (String Data){
            this.data = data;
        }

    public String gethorario() {
        return horario;
    }
        public void sethorario (String horario){
            this.horario = horario;
        }
    public String getstatus() {
        return status;
    }
        public void setstatus (String status){
            this.status = status;

        }


}