
package br.unipar.services;

import br.unipar.erros.InformacaoObrigatoria;
import br.unipar.interfaces.CadastroWebServiceEndereco;
import br.unipar.model.Endereco;
import jakarta.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "br.unipar.interfaces.CadastroWebServiceEndereco")
public class EnderecoService implements CadastroWebServiceEndereco {

    EnderecoService enderecoService = new EnderecoService();

    @Override
    public ArrayList<Endereco> listAllEndereco() throws InformacaoObrigatoria {
        return enderecoService.listAllEndereco();
    }

    @Override
    public Endereco findByIdEndereco(int id) throws InformacaoObrigatoria{
        return enderecoService.findByIdEndereco(id);
    }

    @Override
    public Endereco inserirEndereco(Endereco endereco) throws InformacaoObrigatoria{
       return enderecoService.inserirEndereco(endereco);
    }

    @Override
    public Endereco atualizarEndereco(Endereco endereco) throws InformacaoObrigatoria{
        return enderecoService.atualizarEndereco(endereco);
    }

    @Override
    public void deletarEndereco(int id) throws InformacaoObrigatoria{
        enderecoService.deletarEndereco(id);
    }
    
}