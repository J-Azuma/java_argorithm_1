/**
 * ReverseBubbleSort
 */
public class ReverseBubbleSort {

 public static void main(String[] args) {
  int[] data = {40, 30, 60, 90, 70};
  sort(data);
  for (int element : data) {
   System.out.println(element);
  }
 }

 public static void sort(int[] data) {
  for (int i = data.length - 1; i > 0; i--) {
   for (int j = data.length - 1; j >= data.length - i; j--) {
    if (data[j - 1] < data[j]) {
     int temp = data[j - 1];
     data[j - 1] = data[j];
     data[j] = temp;
    }
   }
  }
 }
}