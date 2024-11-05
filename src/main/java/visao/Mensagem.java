package visao;

public class Mensagem extends Exception {
   public Mensagem(String mensagem) {
      // Envia para a classe mãe a mensagem recebida
      super(mensagem);
   }
   
}
