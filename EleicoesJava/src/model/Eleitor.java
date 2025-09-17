package model;

public class Eleitor extends Pessoa {

    private boolean votou;
    private String codigoEleitor;

    public Eleitor(boolean votou, String codigoEleitor) {
        this.votou = votou;
        this.codigoEleitor = codigoEleitor;
    }

    public boolean getVotou() {
        return votou;
    }

    public void setVotou(boolean votou) {
        this.votou = votou;
    }

    public String getCodigoEleitor() {
        return codigoEleitor;
    }

    public void setCodigoEleitor(String codigoEleitor) {
        this.codigoEleitor = codigoEleitor;
    }

}
