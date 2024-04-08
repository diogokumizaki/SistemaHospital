package br.unipar.model;

import java.util.Date;

public class Consulta {
    
    private Paciente paciente;
    private Medico medico;
    private Date dataHora;
    private String cancelamento;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getCancelamento() {
        return cancelamento;
    }

    public void setCancelamento(String cancelamento) {
        this.cancelamento = cancelamento;
    }

    @Override
    public String toString() {
        return "Consulta{" + "paciente=" + paciente + ", medico=" + medico + ", dataHora=" + dataHora + ", cancelamento=" + cancelamento + '}';
    }
       
}
