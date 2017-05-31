import org.junit.Test;
import static org.junit.Assert.*;

import ziran.Exercise3;
public class Exercise3Test {

  @Test
  public void testLazy0(){
      assertEquals(Exercise3.lazy(0), 1);
  }

  @Test
  public void testLazy1(){
      assertEquals(Exercise3.lazy(1), 2);
  }

  @Test
  public void testLazyThousand(){
      assertEquals(Exercise3.lazy(1000), 500501);
  }

  @Test
  public void testTriangle0(){
      assertEquals(Exercise3.triangle(0), 0);
  }

  @Test
  public void testTriangle1(){
      assertEquals(Exercise3.triangle(1), 1);
  }

  @Test
  public void testTriangleThousand(){
      assertEquals(Exercise3.triangle(1000), 500500);
  }

} // end class
