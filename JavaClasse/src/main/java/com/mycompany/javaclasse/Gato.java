package com.mycompany.javaclasse;

/**
 *
 * @author Ferna
 */

//Fazer uma classe distinguindo com 5 atributos para definir um animal depois criar outra classe para cadastrar 5 animais

public class Gato {
    
    public char sexo;
    public String cor;
    public String corOlhos;
    public int idade;
    public double peso;
    
    public void miar() {
        if (tamanho > 30) 
            System.out.println("Meow, Meow!");
        else if (tamanho > 10)
            System.out.println("Miau, Miau!");
        else
            System.out.println("Miu, Miu!");
    }
    
}
