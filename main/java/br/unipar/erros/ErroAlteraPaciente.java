

package br.unipar.erros;

/**
 *
 * @author diogo
 */
public class ErroAlteraPaciente extends Exception {
    
    public ErroAlteraPaciente () {
        
        super ("Não é possivel alterar CPF, e o E-mail !!");
    }
    
}
