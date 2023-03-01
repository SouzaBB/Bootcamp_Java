/* Estrutura inicial 
// Toda classe começa como public class NomeDaClasse
public class MinhaClasse {
  // void apenas para executar
  public static void main (String [] args) {
    
    System.out.print ("Olá mundo!");
    
  }

}
 */

public class MinhaClasse {

  public static void main (String [] args) {
    
    String primeiroNome = "Bruno";
    String segundoNome = "Batista";
    String terceiroNome = "de Souza";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome, terceiroNome);

    System.out.println(nomeCompleto);    
  }

public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome) {
  return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
}
}