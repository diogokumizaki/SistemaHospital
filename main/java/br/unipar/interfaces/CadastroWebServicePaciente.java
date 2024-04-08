package br.unipar.interfaces;

import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.ErroAlteraPaciente;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.model.Paciente;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;


@WebService
public interface CadastroWebServicePaciente {
    
    @WebMethod
    ArrayList<Paciente> listAllPaciente() throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Paciente findByIdPaciente(@WebParam int id) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Paciente inserirPaciente(Paciente paciente) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Paciente atualizarPaciente(Paciente paciente) throws SQLException, ErroAlteraPaciente, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    void deletarPaciente(int id) throws SQLException, InformacaoObrigatoria;
}
