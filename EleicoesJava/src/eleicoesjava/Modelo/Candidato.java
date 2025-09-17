

package eleicoesjava.Modelo;
public class Candidato   extends Eleitor implements  Idade{
    private int numCandidato;
    private  String senha;
    private Partido part;
    private Integer numVotosCand;

    public Candidato(int numCandidato, String senha, Partido part, Integer numVotosCand, String nome, String BI, String genero, String sobrenome, String dataNasc, String moradia) {
        super(nome, BI, genero, sobrenome, dataNasc, moradia);
        this.numCandidato = numCandidato;
        this.senha = senha;
        this.part = part;
        this.numVotosCand = numVotosCand;
    }

    public Candidato(int numCandidato, String senha, Integer numVotosCand, String nome, String BI, String genero, String sobrenome, String dataNasc, String moradia) {
        super(nome, BI, genero, sobrenome, dataNasc, moradia);
        this.numCandidato = numCandidato;
        this.senha = senha;
        this.numVotosCand = numVotosCand;
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
    public void verificaIdade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Candidato{" + "numCandidato=" + numCandidato + ", senha=" + senha + ", part=" + part + ", numVotosCand=" + numVotosCand + '}';
    }
    
    
    

}

