/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package eleicoesjava.Modelo;



public class Funcionario  extends Eleitor  {
    private String codigoFuncionario, ID,celular;

    public Funcionario(String codigoFuncionario, String celular, String nome, String BI, String genero, String sobrenome, String dataNasc, String Moradia, String Distrito) {
        super(nome, BI, genero, sobrenome, dataNasc, Moradia, Distrito);
        this.codigoFuncionario = codigoFuncionario;
      
        this.celular = celular;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
  
    

    



}
