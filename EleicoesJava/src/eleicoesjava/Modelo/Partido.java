/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicoesjava.Modelo;

public class Partido {

    private int id;
    private String nome;
    private Candidato can;
    private int numVotosPart;

   public Partido(int id, String nome, Candidato can, int numVotosPart) {
        this.id = id;
        this.nome = nome;
        this.can = can;
        this.numVotosPart = numVotosPart;
    }
   
   public Partido(){
       
   }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Candidato getCan() {
        return can;
    }

    public void setCan(Candidato can) {
        this.can = can;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumVotosPart() {
        return numVotosPart;
    }

    public void setNumVotosPart(int numVotosPart) {
        this.numVotosPart = numVotosPart;
    }

}
