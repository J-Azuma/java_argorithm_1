/**
 * BubbleSort
 */
public class BubbleSort {

 public static void main(final String[] args) {
  final int[] data = { 30, 60, 70, 90, 114514, 810 };
  sort(data);
  for (final int element : data) {
   System.out.println(element + " ");
  }
 }

 public static void sort(final int[] data) {
  for (int i = data.length - 1; i > 0; i--) {
   for (int j = 0; j < i; j++) {
    if (data[j] > data[j + 1]) {
     final int temp = data[j + 1];
     data[j + 1] = data[j];
     data[j] = temp;
    }
   }
 }
}
}
