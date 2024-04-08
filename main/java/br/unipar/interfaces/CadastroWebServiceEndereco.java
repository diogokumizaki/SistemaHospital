/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.interfaces;

import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.model.Endereco;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;


@WebService
public interface CadastroWebServiceEndereco {
    
      @WebMethod
    ArrayList<Endereco> listAllEndereco() throws SQLException, InformacaoObrigatoria;

    @WebMethod
    Endereco findByIdEndereco(@WebParam int id) throws SQLException, InformacaoObrigatoria;

    @WebMethod
    Endereco inserirEndereco(Endereco endereco) throws SQLException, InformacaoObrigatoria;

    @WebMethod
    Endereco atualizarEndereco(Endereco endereco)throws SQLException, InformacaoObrigatoria;

    @WebMethod
    void deletarEndereco(int id) throws SQLException, InformacaoObrigatoria;
    
}
