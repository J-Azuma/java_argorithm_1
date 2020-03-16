/**
 * InsertSort
 */
public class InsertSort {

 public static void main(String[] args) {
  int[] data ={30, 60, 70, 90, 20};
  sort(data);
  for (int element : data) {
   System.out.println(element);
  }
 }

 public static void sort(int[] data) {
  for (int i = 0; i < data.length; i++) {
   int temp = data[i];
   int j = i;
   while (j > 0 && temp < data[j - 1]) {
    data[j] = data[j - 1];
    j --;
   }
   data[j] = temp;
  }
 }
}