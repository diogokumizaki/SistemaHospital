
package br.unipar.interfaces;

import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.ErroAlteraPaciente;
import br.unipar.erros.ErroEspecialidades;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.model.Pessoa;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.sql.SQLException;
import java.util.ArrayList;
import jakarta.jws.WebService;


@WebService
public interface CadastroWebServicePessoa {
    
    @WebMethod
    ArrayList<Pessoa> listAllPessoa() throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Pessoa findByIdPessoa(@WebParam int id) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Pessoa inserirPessoa(Pessoa pessoa) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Pessoa atualizarPessoa(Pessoa pessoa) throws SQLException, InformacaoObrigatoria, ErroEspecialidades, ErroAlteraPaciente, ErroAgendaConsulta;

    @WebMethod
    void deletarPessoa(int id) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;
    
}
