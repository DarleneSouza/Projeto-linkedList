
package javalinkedlist;
//import java.lang.Comparable;
public class Atividade implements Comparable<Atividade>{
    private String nome;
    private int prioridade;
    private int tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public int compareTo(Atividade outraAtividade){
      return this.getNome().
              compareTo(outraAtividade.getNome());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Atividade outraAtividade = (Atividade) o;

        return this.nome != null ? (outraAtividade.nome).equals(this.nome) : outraAtividade.nome == null;
    }

    
     @Override
    public String toString(){
        return getNome() + " : " + getPrioridade() + " - " + getTempo() ;
    }// fim toString
    
}
