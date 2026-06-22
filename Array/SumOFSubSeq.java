public class SumOFSubSeq {

    public static int getSum(int[] arr) {
      
        int n = arr.length;
        int sum = 0;
     for(int i = 0; i < arr.length; i++){
          sum += arr[i] * (i + 1) * (n - i);
     }
     return sum;
    }
    public static void main(String[] args) {
        int  arr[] = {1, 4, 5, 3, 2};
        //  Output: 116
        System.out.println(getSum(arr));

    }
}
