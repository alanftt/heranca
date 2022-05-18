package com.mycompany.projetoheranca;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoHeranca {

    public static boolean validarName(String nome) {
        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);
            if (Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Scanner values = new Scanner(System.in);

        String nome;
        String cpf;
        int ra;
        int idade;
        float salario;

                

        System.out.println("Digite o nome do aluno:");
        nome = texto.nextLine();

        while (true) {
            if (validarName(nome)) {
                break;
            }
            System.out.println("Digite um nome válido:");
            nome = texto.nextLine();
        }

        System.out.println("Digite o cpf do aluno:");
        cpf = texto.nextLine();

        do {
            System.out.println("Erro, CPF invalido, digite novamente:");
            cpf = texto.nextLine();
        } while (cpf.length() != 11);

        System.out.println("Digite o ra do aluno:");
        ra = values.nextInt();

        System.out.println("Digite a idade do aluno:");
        idade = values.nextInt();

        while (idade < 10 || idade > 100) { 

            System.out.println("Digite uma idade valida: ");
            idade = values.nextInt();
        }

        System.out.println("-----------");

        System.out.println("A L U N O");

        Aluno a1 = new Aluno(nome, cpf, ra, idade);
  
        
        System.out.println("-----------");

        System.out.println("Digite o nome do Professor:");
        nome = texto.nextLine();
        
        while (true) {
            if (validarName(nome)) {
                break;
            }
            System.out.println("Digite um nome válido: ");
            nome = texto.nextLine();
        }
        

        System.out.println("Digite o cpf do Professor:");
        cpf = texto.nextLine();

        do {
            System.out.println("Erro, CPF invalido, digite novamente:");
            cpf = texto.nextLine();
        } while (cpf.length() != 11);

        System.out.println("Digite a idade do Professor:");
        idade = values.nextInt();

        while (idade < 15 || idade > 100) {

            System.out.println("Digite uma idade valida: ");
            idade = values.nextInt();
        }

        System.out.println("Digite o Salario do Professor:");
        salario = values.nextFloat();

        System.out.println("P R O F E S S O R");

        Professor p1 = new Professor(nome, cpf, idade, salario);
        p1.mostra();

        
        
        System.out.println("-----------");

    }
}