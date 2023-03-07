// Ela deve ter as características: ligada (boolean), canal (int) e volume (int)
// A TV poderá ligar e desligar e assim mudar o estado ligada
// A TV aumentará e diminuirá o volume sempre em +1 ou -1
// A TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente


public class SmartTv {
  boolean ligada = false;
  int volume = 15;
  int canal = 1;

  public void ligar () {
    ligada = true;
  }
  public void desligar () {
    ligada = false;
  }

  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando volume para: " + volume);
  }
  
  public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo volume para: " + volume);
  }

  public void novoCanal(int novoCanal){
    canal = novoCanal;
  }

  public void subirCanal() {
    canal++;
    System.out.println("Subindo para canal: " + canal);
  }

  public void descerCanal() {
    canal--;
    System.out.println("Descendo para canal: " + canal);
  }

}
