

package eleicoesjava.Modelo;

public abstract class Cidadao {
    private String nome , BI,genero,sobrenome,dataNasc,Moradia,Distrito;

    public Cidadao(String nome, String BI, String genero, String sobrenome, String dataNasc, String Moradia, String Distrito) {
        this.nome = nome;
        this.BI = BI;
        this.genero = genero;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.Moradia = Moradia;
        this.Distrito = Distrito;
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
        return "Cidadao{" + "nome=" + nome + ", BI=" + BI + ", genero=" + genero + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", Moradia=" + Moradia + ", Distrito=" + Distrito + '}';
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
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


