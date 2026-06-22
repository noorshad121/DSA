public class SubArray {
    // print subarray
    public static void getSubbArray(int[] arr){
         
        
                for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
               
              for(int k = i; k <= j; k++){
                System.err.print(arr[k]+" ");
               
              }
              System.out.println();
            }
            System.out.println();
        }
    }

    public static void getMaxSubArray(int arr[]){
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }

                if(min < sum){
                    min = sum;
                }
            }
        }

        System.out.println(min);

    }

    public static void getMinSubArray(int arr[]){
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(sum < min){
                   min = sum; 
                }
            }
        }

        System.out.println(min);
    }
    public static void main(String args []){
        int arr[] = {1,1,2,1,1};
        getSubbArray(arr);
        // getMaxSubArray(arr);
        // getMinSubArray(arr);
   
    }
}