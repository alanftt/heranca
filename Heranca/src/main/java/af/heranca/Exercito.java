package af.heranca;

public class Exercito {
    private String setor;
    private String nome;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }

    public String getSetor(){
        return this.setor;
    }
    public String getNome(){
        return this.nome;
    }
    
public void recrutar(){
System.out.println("Soldado recrutado com sucesso");
}

public void subirpatente(){
System.out.println("Soldado condecorado com sucesso");
}

}
