
package br.unipar.erros;

/**
 *
 * @author diogo
 */
public class ErroAgendaConsulta extends Exception {
    
    public ErroAgendaConsulta () {
        
        super ("Não permitir o agendamento de consultas com pacientes e medicos inativos no sistema");
    }
    
}
