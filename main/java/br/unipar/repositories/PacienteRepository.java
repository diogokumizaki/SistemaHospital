package br.unipar.repositories;



import br.unipar.model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {
    private List<Paciente> pacientes;

    public PacienteRepository() {
        this.pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public Paciente buscarPacientePorId(int id) {
        for (Paciente paciente : pacientes) {
            if (paciente.getIdPaciente() == id) {
                return paciente;
            }
        }
        return null;
    }



    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}




   

