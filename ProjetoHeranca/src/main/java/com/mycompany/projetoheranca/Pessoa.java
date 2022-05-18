
package com.mycompany.projetoheranca;


public class Pessoa {
    public String nome;
    private String cpf;
    private int idade;
    
    
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
  }
        
        
  public void setNome (String nome) {
    nome = nome;
  }

  public String getNome () {
    return nome;
  }

  public void setCpf (String cpf) {
    cpf = cpf;
  }
  public String getCpf () {
    return cpf;
  }

  public void setIdade (int idade) {
    idade = idade;
  }

 
  public int getIdade () {
    return idade;
  }

    
    public void mostra(){
    System.out.println("Nome: " +this.nome);
    System.out.println("CPF: " +this.cpf);
    System.out.println("Idade: " +this.idade);
    }
    

}
