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
public class Main {
    public static void main(String[] args) {
       Urso urso = new Urso();
    
    urso.setAltura(2.5);
    urso.setPeso(110);
    urso.setEspecie("Pardo");
    
    urso.imprimirDados();
    
    }    
}
