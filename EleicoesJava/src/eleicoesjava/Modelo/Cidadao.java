

package eleicoesjava.Modelo;

import java.util.Date;

public abstract class Cidadao {
    private int id; 
    private String nome , BI,genero,Moradia,Distrito;
    private  Date dataNasc;
    

    public Cidadao(int id, String nome, String BI, String genero, String Moradia, String Distrito, Date dataNasc) {
        this.nome = nome;
        this.BI = BI;
        this.genero = genero;
        this.Moradia = Moradia;
        this.Distrito = Distrito;
        this.dataNasc = dataNasc;
        this.id = id;
    }

    public Cidadao() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBI() {
        return BI;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cidadao{" + "nome=" + nome + ", BI=" + BI + ", genero=" + genero + ", dataNasc=" + dataNasc + ", Moradia=" + Moradia + ", Distrito=" + Distrito + '}';
    }

    public Date  getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date  dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getMoradia() {
        return Moradia;
    }

    public void setMoradia(String Moradia) {
        this.Moradia = Moradia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }
    

            

}


