/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("Au au au!");
    }
    @Override
    public void tipo(){
        System.out.println("Um Cachorro");
    }
    
    public void reagir(String frase){    //assinatura e parâmetros/Sobrecarga
        if (frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e Latir!");
        }else {
            System.out.println("Rosnar!");
        }
    }
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar");
        }else if (hora >= 18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir (boolean dono){
        if (dono == true){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
            this.emitirSom();
        }
    }
    public void reagir (int idade, float peso){
        if (idade < 5) {
            if (peso < 10){
            System.out.println("Abanar");
        } else {
            System.out.println("Latir");
        }
        }else{ 
         if (peso < 10){
            System.out.println("Rosnar");
         } else {
            System.out.println("Ignorar");
           }
    } 
  }
}