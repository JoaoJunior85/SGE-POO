/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package eleicoesjava.Modelo;

import java.util.Date;



public class Funcionario  extends Eleitor  {
    private String codigoFuncionario, ID,celular;

    public Funcionario(String codigoFuncionario, String ID, String celular, String nome, String BI, String genero, String sobrenome, String Moradia, String Distrito, Date dataNac) {
        super(nome, BI, genero, sobrenome, Moradia, Distrito, dataNac);
        this.codigoFuncionario = codigoFuncionario;
        this.ID = ID;
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
