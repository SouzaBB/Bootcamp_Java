import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
  
    public static void main(String [] args) {
      // criando o scanner
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();
 
        System.out.println("Meu nome completo é: " + nome + " " + sobrenome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha altura é: " + altura);
      
    }
  
}
