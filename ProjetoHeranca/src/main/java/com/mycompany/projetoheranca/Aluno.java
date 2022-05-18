
package com.mycompany.projetoheranca;


public class Aluno extends Pessoa {
    
    private int ra;
    
    public Aluno (String nome, String cpf, int ra, int idade){
    super(nome, cpf, idade);
    this.ra = ra;
    
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void mostra(){
        
        super.mostra();
        System.out.println("Registro : " +this.ra);
                
    }
}
