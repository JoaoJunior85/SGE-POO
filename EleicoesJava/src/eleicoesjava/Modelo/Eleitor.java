

package eleicoesjava.Modelo;



public class Eleitor  extends  Cidadao  implements  Idade{

    private String moradia, distrito;

    public Eleitor( String nome, String BI, String genero, String sobrenome, String dataNasc,String moradia ) {
        super(nome, BI, genero, sobrenome, dataNasc);
        this.moradia = moradia;



    }

    @Override
    public void verificaIdade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Eleitor{" + "moradia=" + moradia + '}';
    }
    
    
            
    

}

