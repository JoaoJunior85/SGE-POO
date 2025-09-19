

package eleicoesjava.Modelo;

import java.util.Date;

public class Candidato   extends Eleitor {
    private int numCandidato;
    private  String senha;
    private Partido part;
    private Integer numVotosCand;

    public Candidato(int numCandidato, String senha, Partido part, Integer numVotosCand, String codigo, int id, String nome, String BI, String genero, String Moradia, String Distrito, Date dataNasc) {
        super(codigo, id, nome, BI, genero, Moradia, Distrito, dataNasc);
        this.numCandidato = numCandidato;
        this.senha = senha;
        this.part = part;
        this.numVotosCand = numVotosCand;
    }

    public Candidato() {
        super();
    }
    
    

    public int getNumCandidato() {
        return numCandidato;
    }

    public void setNumCandidato(int numCandidato) {
        this.numCandidato = numCandidato;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Partido getPart() {
        return part;
    }

    public void setPart(Partido part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Candidato{" + "numCandidato=" + numCandidato + ", senha=" + senha + ", part=" + part + ", numVotosCand=" + numVotosCand + '}';
    }

    public Integer getNumVotosCand() {
        return numVotosCand;
    }

    public void setNumVotosCand(Integer numVotosCand) {
        this.numVotosCand = numVotosCand;
    }
    
    
    

}

