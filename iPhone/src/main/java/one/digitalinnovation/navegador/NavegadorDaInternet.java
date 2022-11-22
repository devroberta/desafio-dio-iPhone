package one.digitalinnovation.navegador;

public interface NavegadorDaInternet {

  void exibirPagina();
  String adicionaNovaAba();
  void atualizarPagina(String endereco);
  void voltarPagina();
  void avancaoPagina();
}
