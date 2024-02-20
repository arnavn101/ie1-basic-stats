import java.util.ArrayList;

class MinMaxCalculation {
  public static int[] compute(ArrayList<Integer> numbers) {
    int min = numbers.get(0);
    int max = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      if (numbers.get(i) < min) {
        min = numbers.get(i);
      }
      if (numbers.get(i) > max) {
        max = numbers.get(i);
      }
    }
    return new int[] {min, max};
  }
}