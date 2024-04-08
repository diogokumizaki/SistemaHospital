
package br.unipar.erros;

/**
 *
 * @author diogo
 */
public class ErroAlteraMedico extends Exception {
    
    public ErroAlteraMedico () {
        super("Não è possivel alterar o e-mail do médico, CRM, Especialidade");
    }
    
}
