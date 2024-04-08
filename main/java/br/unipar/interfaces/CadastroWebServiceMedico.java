package br.unipar.interfaces;

import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.ErroAlteraMedico;
import br.unipar.erros.ErroEspecialidades;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.model.Medico;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

@WebService
public interface CadastroWebServiceMedico {
    
    @WebMethod
    ArrayList<Medico> listAllMedico() throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Medico findByIdMedico(@WebParam int id) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Medico inserirMedico(Medico medico)throws SQLException, ErroEspecialidades, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Medico atualizarMedico(Medico medico) throws SQLException,  ErroAlteraMedico, InformacaoObrigatoria, ErroAgendaConsulta ;

    @WebMethod
    void deletarMedico(int id) throws SQLException, InformacaoObrigatoria;
}
