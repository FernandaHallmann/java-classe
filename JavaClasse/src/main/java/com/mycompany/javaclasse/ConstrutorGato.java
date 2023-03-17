package com.mycompany.javaclasse;

/**
 *
 * @author Ferna
 */
public class ConstrutorGato {

    private String nomeGato;
    private char sexoGato;
    private String corGato;
    private String corOlhosGato;
    private int idadeGato;
    private double pesoGato;
    private int tamanhoGato;

    public void miar() {
        if (tamanhoGato >= 30) {
            System.out.println("Meow, Meow!\n");
        } else if (tamanhoGato >= 10) {
            System.out.println("Miau, Miau!\n");
        } else {
            System.out.println("Miu, Miu!\n");
        }
    }

    public ConstrutorGato(String nome, char sexo, String cor, String corOlhos, int idade, double peso, int tamanho) {
        nomeGato = nome;
        sexoGato = sexo;
        corGato = cor;
        corOlhosGato = corOlhos;
        idadeGato = idade;
        pesoGato = peso;
        tamanhoGato = tamanho;
    }
    
    public String getInfos() {
        return "Nome do Gato: " + nomeGato + "\nSexo: " + sexoGato + "\nCor: " + corGato + "\nCor dos olhos: " + corOlhosGato + "\nIdade: " + idadeGato + "\nPeso: " + pesoGato;
    }

}