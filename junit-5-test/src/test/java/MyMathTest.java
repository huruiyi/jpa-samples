import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class MyMathTest {

  private MyMath math = new MyMath();

  @Test
  void calculateSum_ThreeMemberArray() {
    assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
  }

  @Test
  void calculateSum_ZeroLengthArray() {
    assertEquals(0, math.calculateSum(new int[]{}));
  }

  MyMath myMath = new MyMath();


  @Test
  public void sum_with3numbers() {
    System.out.println("Test1");
    assertEquals(6, myMath.sum(new int[]{1, 2, 3}));
  }

  @Test
  public void sum_with1number() {
    System.out.println("Test2");
    assertEquals(3, myMath.sum(new int[]{3}));
  }

  private Predicate<String> notContain(List<String> list) {
    return item -> !list.contains(item);
  }

  @Test
  public void Test1() {
    List<String> newAppRoleQualifiers = Arrays.asList("1", "2", "3");
    List<String> originalAppRoleQualifiers = Arrays.asList("1", "2", "3", "4", "5", "6");
    Stream<String> deleteQualifiers   = originalAppRoleQualifiers.stream().filter(notContain(newAppRoleQualifiers));

    List<String> list = deleteQualifiers.toList();
    System.out.println(String.join("-", list));
  }


  @Test
  void Test2() {
    //now
    List<String> bList = Arrays.asList("1");
    //old
    List<String> aList = Arrays.asList("1", "2", "3");
    List<String> cList = new ArrayList<>();

    aList.stream().filter(item -> !bList.contains(item)).forEach(cList::add);
    System.out.println(String.join("-", cList));
  }

}
