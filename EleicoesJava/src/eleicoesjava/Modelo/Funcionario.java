/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package eleicoesjava.Modelo;

import java.util.Date;



public class Funcionario  extends Eleitor  {
    private String codigoFuncionario, celular;

    public Funcionario(String codigoFuncionario, String celular, String codigo, int id, String nome, String BI, String genero, String Moradia, String Distrito, Date dataNasc) {
        super(codigo, id, nome, BI, genero, Moradia, Distrito, dataNasc);
        this.codigoFuncionario = codigoFuncionario;
        this.celular = celular;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
  
    

    



}
