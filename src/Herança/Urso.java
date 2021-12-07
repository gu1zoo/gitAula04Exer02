/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança;

/**
 *
 * @author IFSC
 */
public class Urso extends Mamifero{
   private String especie;

    public Urso() {
    }

   public void imprimirDados(){
       System.out.println("Especie: "+especie);
       System.out.println("Altura: "+altura+" Metros");
       System.out.println("Peso: "+peso+"KG");
       
   }
    public String getEspecie() {
        return especie;
    }

    public Urso(String especie) {
        this.especie = especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
   
   
}
