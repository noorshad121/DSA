public class TwoPointer {
    public static boolean getTarget(int[] arr, int target){ 
         
        for(int i = 0; i < arr.length-1; i++){
            if(arr < )
        }
        int s = 0;
        int e = arr.length-1;
    while(s < e) {
        if(arr[s] + arr[e] == target)
 {
     return true;
 }  
 else if(arr[s] + arr[e]< target) {
     s++;
 }
 else {
    e--;
 }
  }
  return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        
        System.out.println(getTarget(arr, 6));
    }
}
