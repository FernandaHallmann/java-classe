package com.mycompany.javaclasse;

/**
 *
 * @author Ferna
 */
public class TesteConstrutorGato {

    public static void main(String[] args) {
        
        ConstrutorGato gato1 = new ConstrutorGato("Bart", 'M', "Branco", "Azul Claro", 5, 3.5, 35);
        System.out.println(gato1.getInfos());
        gato1.miar();
        
        ConstrutorGato gato2 = new ConstrutorGato("Suzi", 'F', "Sialata", "Azul", 3, 4.8, 9);
        System.out.println(gato2.getInfos());
        gato2.miar();
        
        ConstrutorGato gato3 = new ConstrutorGato("Alice", 'F', "Cinza", "Amarelo", 3, 2.8, 25);
        System.out.println(gato3.getInfos());
        gato3.miar();
        
        ConstrutorGato gato4 = new ConstrutorGato("Frederico", 'M', "Rajado", "Verde", 5, 4.5, 40);
        System.out.println(gato4.getInfos());
        gato4.miar();
        
        ConstrutorGato gato5 = new ConstrutorGato("Dark", 'M', "Preto", "Amarelo", 2, 3.7, 29);
        System.out.println(gato5.getInfos());
        gato5.miar();
        
    }
}
