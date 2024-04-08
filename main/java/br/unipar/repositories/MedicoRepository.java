package br.unipar.repositories;


import br.unipar.model.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoRepository {
    private List<Medico> medicos;

    public MedicoRepository() {
        this.medicos = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void removerMedico(Medico medico) {
        medicos.remove(medico);
    }

    public List<Medico> buscarMedicosPorEspecialidade(String especialidade) {
        List<Medico> medicosEspecialidade = new ArrayList<>();
        for (Medico medico : medicos) {
            if (medico.getEspecialidade().equalsIgnoreCase(especialidade)) {
                medicosEspecialidade.add(medico);
            }
        }
        return medicosEspecialidade;
    }

    public Medico buscarMedicoPorCrm(int crm) {
        for (Medico medico : medicos) {
            if (medico.getCrm() == crm) {
                return medico;
            }
        }
        return null;
    }



    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
}

    

   
          
