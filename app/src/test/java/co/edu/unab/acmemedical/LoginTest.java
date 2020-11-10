package co.edu.unab.acmemedical;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


public class LoginTest {

   @Test
    public void validarCorreo() throws Exception{
       LoginUtils utils = new LoginUtils();

       assertTrue(utils.correoValido("fake@corre.com"));
   }

}