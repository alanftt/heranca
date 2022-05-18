
package com.mycompany.projetoheranca;

public class Professor extends Pessoa{
    private float salario;
    
    public Professor (String nome, String cpf, int idade, float salario){
        super(nome, cpf, idade);
        this.salario = salario;
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    
    public void mostra(){
        
        super.mostra();
        System.out.println("Salario: " +this.salario);
    
    }
}
