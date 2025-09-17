/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package eleicoesjava.Modelo;



public class Funcionario  extends Eleitor  implements  Idade{
    private String codigoFuncionario, ID,celular;

    public Funcionario(String codigoFuncionario, String ID, String celular, String nome, String BI, String genero, String sobrenome, String dataNasc, String moradia) {
        super(nome, BI, genero, sobrenome, dataNasc, moradia);
        this.codigoFuncionario = codigoFuncionario;
        this.ID = ID;
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
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

    @Override
    public void verificaIdade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    



}
