class SelectionSort {
 //mainメソッドは整列後の配列を出力する機能のみを持たせる
 public static void main(String[] args) {
  int[] data = {30, 60, 70, 90, 40};
  sort(data);
  for(int element : data) {
   System.out.println(element + " ");
  }

 }
 

  public static void sort(int[] data) {
   //配列の要素数―1回ループさせて最小値を確定させる(n - 1回並び変えた時点で残り1つの位置が決まるため)
   for (var i = 0; i < data.length; i ++) {
    //最小値である要素の添字(最小値そのものと間違えそう.こんな感じで注釈を着けておくとよさそう)
    int min = i;
    //data[min](data[i])=基準値とi+1番目~の要素と比較していく
    for (var j = i + 1; j < data.length; j++) {
    //data[min]よりも小さい値が見つかればminにjを代入する(この時点ではまだ要素の入れ替えはしない)
      if(data[j] < data[min]){
       min = j;
    }
   }
    //配列要素の入れ替えを行う
    int temp = data[i];
    data[i] = data[min];
    data[min] = temp;
   }
 }
}




