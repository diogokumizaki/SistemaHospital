package br.unipar.services;

import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.ErroAlteraPaciente;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.interfaces.CadastroWebServicePaciente;
import br.unipar.model.Paciente;
import jakarta.jws.WebService;
import java.util.ArrayList;


@WebService(endpointInterface = "br.unipar.interfaces.CadastroWebServicePaciente")
public class PacienteService implements CadastroWebServicePaciente {
    
    
    PacienteService pacienteService = new PacienteService ();

    @Override
    public ArrayList<Paciente> listAllPaciente() throws InformacaoObrigatoria, ErroAgendaConsulta{
        return pacienteService.listAllPaciente();
    }

    @Override
    public Paciente findByIdPaciente(int id) throws InformacaoObrigatoria, ErroAgendaConsulta{
        return pacienteService.findByIdPaciente(id);
    }

    @Override
    public Paciente inserirPaciente(Paciente paciente) throws InformacaoObrigatoria, ErroAgendaConsulta{
            return pacienteService.inserirPaciente(paciente);
    }

    @Override
    public Paciente atualizarPaciente(Paciente paciente) throws InformacaoObrigatoria, ErroAgendaConsulta, ErroAlteraPaciente{
        return pacienteService.atualizarPaciente(paciente);
    }

    @Override
    public void deletarPaciente(int id) throws InformacaoObrigatoria{
        pacienteService.deletarPaciente(id);
    }
    
}
