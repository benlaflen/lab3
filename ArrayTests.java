import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void ActuallyTestReverseInPlace() {
    int[] input = {1,2,3};
    ArrayExamples.reverseInPlace(input);
    System.out.print("\n Final Array: ");
    assertArrayEquals(new int[]{3,2,1}, input);
  }

  @Test
  public void ActuallyTestReverse() {
    int[] input = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input));
  }

  @Test
  public void TestaverageWithoutLowest() {
    double[] input = new double[]{1,1,2,2,3,3,4,4};
    assertEquals((int)3,(int)ArrayExamples.averageWithoutLowest(input));
  }
}
