public class Parametros {
   private static Parametros instance = new Parametros();
   private String nomeBanco;
   private String clienteLogado;

   private Parametros() {
   }

   public static Parametros getInstance() {
      return instance;
   }

   public String getNomeBanco() {
      return this.nomeBanco;
   }

   public void setNomeBanco(String nomeBanco) {
      this.nomeBanco = nomeBanco;
   }

   public String getClienteLogado() {
      return this.clienteLogado;
   }

   public void setClienteLogado(String clienteLogado) {
      this.clienteLogado = clienteLogado;
   }
}