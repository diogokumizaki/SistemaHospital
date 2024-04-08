
package br.unipar.erros;

/**
 *
 * @author 00233397
 */
public class ErroEspecialidades extends Exception{

    public ErroEspecialidades() {
        super("Especialidade invalida selecione Ortopedia, Cardiologia, Dermatologia ou Ginecologia");
    }
    
}
