package model;

import java.time.LocalDateTime;

public class Funcionarios extends Eleitor {

    private String cargo;
    private String nivelDAcesso;
    private String senha;
    private LocalDateTime ultimoAcesso;

    public Funcionarios(boolean votou, String codigoEleitor) {
        super(votou, codigoEleitor);
    }

    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivelDAcesso() {
        return nivelDAcesso;
    }

    public void setNivelDAcesso(String nivelDAcesso) {
        this.nivelDAcesso = nivelDAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

}
