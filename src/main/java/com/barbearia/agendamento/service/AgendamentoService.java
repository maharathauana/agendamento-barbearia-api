package com.barbearia.agendamento.service;
import com.barbearia.agendamento.enums.StatusAgendamento;
import com.barbearia.agendamento.model.Agendamento;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

    public class AgendamentoService {
        private List<Agendamento> agendamentos = new ArrayList<>();
        private Long proximoId = 1L;
        public Agendamento criarAgendamento(Agendamento agendamento) {


            if (agendamento.getData().isBefore(LocalDate.now())) {
                throw new RuntimeException("Não é possível agendar em datas passadas");
            }

            agendamento.setStatus(StatusAgendamento.AGENDADO);
            for (Agendamento existente : agendamentos){
                if (existente.getNomeBarbeiro().equals(agendamento.getNomeBarbeiro())){
                   if (existente.getData().equals(agendamento.getData())){
                      if(existente.getHorario().equals(agendamento.getHorario())){
                          throw new RuntimeException("Horário indisponível");
                      }
                   }
                }
                if (existente.getNomeCliente().equals(agendamento.getNomeCliente())){
                    if (existente.getData().equals(agendamento.getData())){
                        if (existente.getHorario().equals(agendamento.getHorario())){
                            throw new RuntimeException("Cliente já possui agendamento nesse horário");
                        }
                    }
                }
            }
            agendamento.setId(proximoId);
            proximoId++;

            agendamentos.add(agendamento);

            return agendamento;


        }

        public List<Agendamento> listarAgendamentos() {
            return agendamentos;
        }
        public Agendamento cancelarAgendamento(Long id) {

            for (Agendamento existente : agendamentos) {



                    if (existente.getId().equals(id)){
                        if (existente.getStatus() == StatusAgendamento.CONCLUIDO){
                            throw new RuntimeException("Agendamento concluído não pode ser cancelado");
                        }
                    }
                    existente.setStatus(StatusAgendamento.CANCELADO);

                    return existente;
            }

            throw new RuntimeException("Agendamento não encontrado");
        }

        public Agendamento concluirAgendamento(Long id) {

            for (Agendamento existente : agendamentos) {

                if (existente.getId().equals(id)) {

                    if (existente.getStatus() == StatusAgendamento.CANCELADO) {
                        throw new RuntimeException("Agendamento cancelado não pode ser concluído");
                    }

                    existente.setStatus(StatusAgendamento.CONCLUIDO);

                    return existente;
                }
            }

            throw new RuntimeException("Agendamento não encontrado");
        }
    }


