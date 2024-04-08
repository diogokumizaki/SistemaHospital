package br.unipar.model;



public class Paciente extends Pessoa{
    
    private int idPaciente;
    private String Status;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", Status=" + Status + '}';
    }

    

    
    
}

 