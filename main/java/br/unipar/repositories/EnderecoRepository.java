/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.repositories;


import br.unipar.model.Endereco;
import java.util.ArrayList;
import java.util.List;

public class EnderecoRepository {
    private List<Endereco> enderecos;

    public EnderecoRepository() {
        this.enderecos = new ArrayList<>();
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void removerEndereco(Endereco endereco) {
        enderecos.remove(endereco);
    }

    public List<Endereco> buscarEnderecosPorCidade(String cidade) {
        List<Endereco> enderecosCidade = new ArrayList<>();
        for (Endereco endereco : enderecos) {
            if (endereco.getCidade().equalsIgnoreCase(cidade)) {
                enderecosCidade.add(endereco);
            }
        }
        return enderecosCidade;
    }

    public List<Endereco> buscarEnderecosPorUf(String uf) {
        List<Endereco> enderecosUf = new ArrayList<>();
        for (Endereco endereco : enderecos) {
            if (endereco.getUf().equalsIgnoreCase(uf)) {
                enderecosUf.add(endereco);
            }
        }
        return enderecosUf;
    }

    

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}


