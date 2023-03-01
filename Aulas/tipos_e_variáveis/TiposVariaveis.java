package Bootcamp_Java.Aulas.tipos_e_variáveis;

public class TiposVariaveis {
  
  public static void main(String [] args) {
    double salarioMinimo = 2500;
    String meuNome = "Bruno";
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    
    // Aqui ocorre conversão de tipos para a variável numeroNormal
    short numeroCurto2 = (short) numeroNormal;

    // Aqui mostra um exemplo de valor imutável com o argumento final
    final double VALOR_DE_PI = 3.14;

    System.out.print(VALOR_DE_PI);
    System.out.println(meuNome);
    System.out.println(numeroCurto);
    System.out.println(numeroCurto2);
    System.out.println(salarioMinimo);
  }
}