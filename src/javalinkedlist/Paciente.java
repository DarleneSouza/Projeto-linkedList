
package javalinkedlist;
//import java.lang.Comparable;
public class Paciente implements Comparable<Paciente>{
    private String nome;
    private String enfermidade;
    private int prioridade;
    private int tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEnfermidade(){
        return enfermidade;
    }
    public void setEnfermidade(String enfermidade){
        this.enfermidade = enfermidade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public int compareTo(Paciente outroPaciente){ 
      return this.getNome().
              compareTo(outroPaciente.getNome());
    }
    
    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente outroPaciente = (Paciente) o;

        return this.nome != null ? (outroPaciente.nome).equals(this.nome) : outroPaciente.nome == null;
    }

    
     @Override
    public String toString(){
        return getNome() + " : "  + getEnfermidade()+ " - " + getPrioridade() + " - " + getTempo() ;
    }// fim toString
    
}
