
package af.heranca;
import java.util.Scanner;


public class Soldado extends Exercito {
    private String patente;
    private int anos;

    
    public Soldado(String quadrante,String setor,String nome,int anos,String patente){
    }
    
    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
        System.out.println("DIgite o nome do Soldado a ser avaliado:");
        String nome = texto.nextLine();
        
          for (int i = 0; i < nome.length(); i++) {
          if (Character.isDigit(nome.charAt(i))== true)
          {
              
             
        System.out.println("O valor digitado não é um nome"); 
          
          }
      
          
 
        System.out.println("Digite a patente do soldado digitado:");
        String patente = texto.nextLine();
       
        
        System.out.println("Digite  qual setor do exercito o soldado trabalha:");
        String setor = texto.nextLine();
      

        System.out.println("Digite quantos anos de serviço o soldado apresentou:");
        int anos = texto.nextInt();
          
        
        
    }
    return;
 }
}
