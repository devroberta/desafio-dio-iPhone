package one.digitalinnovation.telefone;

public class AparelhoTelefonico {

  long numero;

  public void ligar(long numero) {
    System.out.printf("Ligando para o número: %d", numero);
  }

  public void atender() {
    System.out.println("Atendendo ligação.");
  }

  public String iniciarCorreioVoz() {
    return "Essa é uma gravaçãod do Correio de Voz";

  }
}
