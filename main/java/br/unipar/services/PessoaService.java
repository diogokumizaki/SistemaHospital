
 package br.unipar.services;

import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.ErroAlteraPaciente;
import br.unipar.erros.ErroEspecialidades;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.interfaces.CadastroWebServicePessoa;
import br.unipar.model.Pessoa;
import jakarta.jws.WebService;
import java.util.ArrayList;


@WebService(endpointInterface = "br.unipar.interfaces.CadastroWebServicePessoa")
public class PessoaService implements CadastroWebServicePessoa {

    PessoaService pessoaService = new PessoaService();

    @Override
    public ArrayList<Pessoa> listAllPessoa() throws InformacaoObrigatoria, ErroAgendaConsulta{
        return pessoaService.listAllPessoa();
    }

    @Override
    public Pessoa findByIdPessoa(int id) throws InformacaoObrigatoria, ErroAgendaConsulta{
        return pessoaService.findByIdPessoa(id);
    }

    @Override
    public Pessoa inserirPessoa(Pessoa pessoa) throws InformacaoObrigatoria, ErroAgendaConsulta{
       return pessoaService.inserirPessoa(pessoa);
    }

    @Override
    public Pessoa atualizarPessoa(Pessoa pessoa) throws InformacaoObrigatoria, ErroAgendaConsulta, ErroEspecialidades, ErroAlteraPaciente{
        return pessoaService.atualizarPessoa(pessoa);
    }

    @Override
    public void deletarPessoa(int id) throws InformacaoObrigatoria, ErroAgendaConsulta{
        pessoaService.deletarPessoa(id);
    }
    
}