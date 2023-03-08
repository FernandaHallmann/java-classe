package com.mycompany.javaclasse;

/**
 *
 * @author Ferna
 */

//Fazer uma classe distinguindo com 5 atributos para definir um animal depois criar outra classe para cadastrar 5 animais

public class TesteGato {

    public static void main(String[] args) {
        Gato bart = new Gato();
        bart.sexo = 'M';
        bart.cor = "Branco";
        bart.corOlhos = "Azul";
        bart.idade = 5;
        bart.peso = 3.5;
        bart.tamanho = 35;
        bart.miar();
        
        Gato suzi = new Gato();
        suzi.sexo = 'F';
        suzi.cor = "Sialata";
        suzi.corOlhos = "Azul";
        suzi.idade = 3;
        suzi.peso = 4.8;
        suzi.tamanho = 9;
        suzi.miar();
        
        Gato alice = new Gato();
        alice.sexo = 'F';
        alice.cor = "Cinza";
        alice.corOlhos = "Amarelo";
        alice.idade = 3;
        alice.peso = 2.8;
        alice.tamanho = 25;
        alice.miar();
        
        Gato frederico = new Gato();
        frederico.sexo = 'M';
        frederico.cor = "Rajado";
        frederico.corOlhos = "Verde";
        frederico.idade = 5;
        frederico.peso = 4.5;
        frederico.tamanho = 40;
        frederico.miar();
        
        Gato dark = new Gato();
        dark.sexo = 'M';
        dark.cor = "Preto";
        dark.corOlhos = "Amarelo";
        dark.idade = 2;
        dark.peso = 3.7;
        dark.tamanho = 29;
        dark.miar();
    }
}
