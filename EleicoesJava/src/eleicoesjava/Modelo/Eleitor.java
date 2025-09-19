

package eleicoesjava.Modelo;

import java.util.Date;
import java.util.Random;



public class Eleitor  extends  Cidadao{
    private String codigo;

    public Eleitor(String codigo, int id, String nome, String BI, String genero, String Moradia, String Distrito, Date dataNasc) {
        super(id, nome, BI, genero, Moradia, Distrito, dataNasc);
        this.codigo = codigo;
    }

    public Eleitor() {
        super();
    }

    
     private String gerarCodigo(){
         Random random=  new Random();
         int numeros = 100000+ random.nextInt(900000);
         char letra1 = (char)('A'+random.nextInt(26));
         char letra2 =(char)('A'+random.nextInt(26));
         String  codigoAleatorio= numeros + ""+letra1+letra2;
         
         
         return codigoAleatorio;
     }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     

   

            
    

}

