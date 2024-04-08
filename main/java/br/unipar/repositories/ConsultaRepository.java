/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.repositories;


import br.unipar.model.Consulta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultaRepository {
    private List<Consulta> consultas;

    public ConsultaRepository() {
        this.consultas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    public List<Consulta> buscarConsultasPorPaciente(String nomePaciente) {
        List<Consulta> consultasPaciente = new ArrayList<>();
        for (Consulta consulta : consultas) {
            if (consulta.getPaciente().getNome().equals(nomePaciente)) {
                consultasPaciente.add(consulta);
            }
        }
        return consultasPaciente;
    }

    public List<Consulta> buscarConsultasPorMedico(String nomeMedico) {
        List<Consulta> consultasMedico = new ArrayList<>();
        for (Consulta consulta : consultas) {
            if (consulta.getMedico().getNome().equals(nomeMedico)) {
                consultasMedico.add(consulta);
            }
        }
        return consultasMedico;
    }

    public List<Consulta> buscarConsultasPorData(Date data) {
        List<Consulta> consultasData = new ArrayList<>();
        for (Consulta consulta : consultas) {
            if (consulta.getDataHora().equals(data)) {
                consultasData.add(consulta);
            }
        }
        return consultasData;
    }



    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}



