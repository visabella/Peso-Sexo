import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int feminino = 0, masculino = 0, peso;
    String sexo;
    
    System.out.println("Digite F para Feminino, M para Masculino: ");
    
    for (int i = 0; i < 10; i++){
      
      System.out.print("Insira seu sexo: ");
      sexo = scan.next();
      
      System.out.print("Insira seu peso: ");
      peso = scan.nextInt();
      
      if (sexo.equals("M") & peso >= 60 && peso <= 80) {
        masculino += 1;
      }
      if (sexo.equals("F") & peso >= 50 && peso <= 70) {
        feminino += 1;
      }
    }
    if (masculino <= 0) {
      
      System.out.println("Não há ninguem do sexo masculino com peso com peso entre 70 e 80 ");
      
    }
   
 if (masculino > 1) {
   
 System.out.println("Existe " + masculino + " pessoas do sexo masculino com peso entre 60 há 80kl"); } 

    if (feminino > 1 ){
      System.out.println("Existe " + feminino + " pessoas do sexo feminino com peso entre 60 há 80 kl");}
        
        else{ System.out.println("Não há ninguem do sexo feminino com peso com peso entre 70 e 80" );}
    }
}
    


    
  

