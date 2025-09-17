
package model;

public final class Partido {

    private String numero;
    private String sigal;
    private String nome;
    private String presidente;
    private String votosP;

    public Partido(String numero, String sigal, String nome, String presidente, String votosP) {
        this.numero = numero;
        this.sigal = sigal;
        this.nome = nome;
        this.presidente = presidente;
        this.votosP = votosP;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSigal() {
        return sigal;
    }

    public void setSigal(String sigal) {
        this.sigal = sigal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getVotosP() {
        return votosP;
    }

    public void setVotosP(String votosP) {
        this.votosP = votosP;
    }

}
