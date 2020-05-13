import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyTest {

   @Test
   public void testMediaLittleArray() {
      double [] array = {1.0, 2.0, 3.0};

      double expected = 2.0;

      double result = Media.media(array);

      assertEquals(result, expected, 0.001);
   }
}
