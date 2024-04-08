package br.unipar.services;



import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.interfaces.CadastroWebServiceConsulta;
import br.unipar.model.Consulta;
import jakarta.jws.WebService;

import java.util.ArrayList;


@WebService(endpointInterface = "br.unipar.interfaces.CadastroWebServiceConsulta")
public class ConsultaService implements CadastroWebServiceConsulta {

    ConsultaService consultaService = new ConsultaService();

    @Override
    public ArrayList<Consulta> listAllConsulta() throws InformacaoObrigatoria, ErroAgendaConsulta{
        return consultaService.listAllConsulta();
    }

    @Override
    public Consulta findByIdConsulta(int id) throws InformacaoObrigatoria, ErroAgendaConsulta{
        return consultaService.findByIdConsulta(id);
    }

    @Override
    public Consulta inserirConsulta(Consulta consulta) throws InformacaoObrigatoria, ErroAgendaConsulta {
       return consultaService.inserirConsulta(consulta);
    }

    @Override
    public Consulta atualizarConsulta(Consulta consulta) throws InformacaoObrigatoria, ErroAgendaConsulta {
        return consultaService.atualizarConsulta(consulta);
    }

    @Override
    public void deletarConsulta(int id) throws InformacaoObrigatoria {
        consultaService.deletarConsulta(id);
    }
    
}