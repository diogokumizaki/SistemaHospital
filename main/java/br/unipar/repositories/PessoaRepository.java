package br.unipar.repositories;



import br.unipar.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {
    private List<Pessoa> pessoas;

    public PessoaRepository() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public Pessoa buscarPessoaPorId(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdPessoa() == id) {
                return pessoa;
            }
        }
        return null;
    }

    

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}

