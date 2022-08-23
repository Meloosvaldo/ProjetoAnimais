/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

public abstract class Animal {
    protected float peso;
    protected int idade, membro;
   
    
    public abstract void  locomover();
    public abstract void alimentar ();
    public abstract void emitirSom ();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembro() {
        return membro;
    }

    public void setMembro(int membro) {
        this.membro = membro;
    }

    @Override
    public String toString() {
        return """
               -----------------Tipos de Animais------------------ 
                Animal: peso = """ + peso + ", idade = " + idade + ", membro(s) = " + membro;
    }
    
    
}
