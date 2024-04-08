/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.interfaces;

import br.unipar.erros.ErroAgendaConsulta;
import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.model.Consulta;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;


@WebService
public interface CadastroWebServiceConsulta {
    
     @WebMethod
    ArrayList<Consulta> listAllConsulta() throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Consulta findByIdConsulta(@WebParam int id) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Consulta inserirConsulta(Consulta consulta) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    Consulta atualizarConsulta(Consulta consulta) throws SQLException, InformacaoObrigatoria, ErroAgendaConsulta;

    @WebMethod
    void deletarConsulta(int id) throws SQLException, InformacaoObrigatoria;
}
