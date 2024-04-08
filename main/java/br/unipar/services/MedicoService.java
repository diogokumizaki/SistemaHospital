package br.unipar.services;

import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.ErroAlteraMedico;
import br.unipar.erros.ErroEspecialidades;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.model.Medico;
import jakarta.jws.WebService;
import br.unipar.interfaces.CadastroWebServiceMedico;
import java.util.ArrayList;

@WebService(endpointInterface = "br.unipar.interfaces.CadastroWebServiceMedico")
public class MedicoService implements CadastroWebServiceMedico {

    MedicoService medicoService = new MedicoService();

    @Override
    public ArrayList<Medico> listAllMedico() throws InformacaoObrigatoria, ErroAgendaConsulta{
        return medicoService.listAllMedico();
    }

    @Override
    public Medico findByIdMedico(int id) throws InformacaoObrigatoria, ErroAgendaConsulta{
        return medicoService.findByIdMedico(id);
    }

    @Override
    public Medico inserirMedico(Medico medico) throws InformacaoObrigatoria, ErroAgendaConsulta, ErroEspecialidades{
            return medicoService.inserirMedico(medico);
    }

    @Override
    public Medico atualizarMedico(Medico medico) throws InformacaoObrigatoria, ErroAgendaConsulta, ErroAlteraMedico{
        return medicoService.atualizarMedico(medico);
    }

    @Override
    public void deletarMedico(int id) throws InformacaoObrigatoria{
        medicoService.deletarMedico(id);
    }
    
}


      
