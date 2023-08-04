import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void test() {
    Assertions.assertEquals(1, Main.count1s(1));
    Assertions.assertEquals(3, Main.count1s(7));
    Assertions.assertEquals(4, Main.count1s(15));
    Assertions.assertEquals(0, Main.count1s(0));
    Assertions.assertEquals(1, Main.count1s(Integer.MIN_VALUE));
    Assertions.assertEquals(32, Main.count1s(-1));
    Assertions.assertEquals(31, Main.count1s(Integer.MAX_VALUE));
  }

  @Test
  public void testV2() {
    Assertions.assertEquals(1, Main.count1sV2(1));
    Assertions.assertEquals(3, Main.count1sV2(7));
    Assertions.assertEquals(4, Main.count1sV2(15));
    Assertions.assertEquals(0, Main.count1sV2(0));
    Assertions.assertEquals(1, Main.count1sV2(Integer.MIN_VALUE));
    Assertions.assertEquals(32, Main.count1sV2(-1));
    Assertions.assertEquals(31, Main.count1sV2(Integer.MAX_VALUE));
  }

  @Test
  public void testV3() {
    Assertions.assertEquals(1, Main.count1sV3(1));
    Assertions.assertEquals(3, Main.count1sV3(7));
    Assertions.assertEquals(4, Main.count1sV3(15));
    Assertions.assertEquals(0, Main.count1sV3(0));
    Assertions.assertEquals(1, Main.count1sV3(Integer.MIN_VALUE));
    Assertions.assertEquals(32, Main.count1sV3(-1));
    Assertions.assertEquals(31, Main.count1sV3(Integer.MAX_VALUE));
  }
}
