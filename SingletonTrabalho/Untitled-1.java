
package padroescriacao.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParametrosTest {
   ParametrosTest() {
   }

   @Test
   public void deveRetornarNomeBanco() {
      Parametros.getInstance().setNomeBanco("Banco 1");
      Assertions.assertEquals("Banco 1", Parametros.getInstance().getNomeBanco());
   }

   @Test
   public void deveRetornarClienteLogado() {
      Parametros.getInstance().setClienteLogado("Cliente 1");
      Assertions.assertEquals("Cliente 1", Parametros.getInstance().getClienteLogado());
   }
}