package Bootcamp_Java.Aulas.Terminal_e_argumentos;

public class AboutMe {
  
  public static void main(String [] args) {

    String nome = args[0];
    String sobreNome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("Meu nome completo é: " + nome + " " + sobreNome);
    System.out.println("Minha idade é: " + idade);
    System.out.println("Minha altura é: " + altura);
    
  }

}