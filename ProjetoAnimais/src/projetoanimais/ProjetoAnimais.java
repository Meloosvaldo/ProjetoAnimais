/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoanimais;

public class ProjetoAnimais {

 
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra ç = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        
        k.setPeso(45.6f);
        k.setIdade(3);
        k.setMembro(4);
        System.out.println(k.toString());
        k.tipo();
        k.reagir(4,11.5f);
        k.emitirSom();
      
       
    }
    
}
