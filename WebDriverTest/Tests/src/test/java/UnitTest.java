import org.junit.Assert;
import  org.junit.Test;


public class UnitTest {
   @Test
    public  void  canGoToHomePage() {
       Pages.homePage().goTo();
       Assert.assertTrue(Pages.homePage().isAt());
   }
}
