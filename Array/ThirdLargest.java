public class ThirdLargest {
    
    public static int thirdLargest(int arr[]){
       
        int largest = 0;
        int secLargest = 0;
        int thLargest = 0;
        for(int i = 0; i< arr.length; i++){
            if(largest < arr[i]) {
                thLargest = secLargest;
                secLargest = largest;
                largest = arr[i];
            }
            else if(secLargest < arr[i] && arr[i] != largest){
                thLargest = secLargest;
                secLargest = arr[i];
            }
            else if(thLargest < arr[i] && arr[i] != secLargest && arr[i] != largest){
                  
                thLargest = arr[i];
            }
        }

        return thLargest;
    }
    public static void main(String[] args) {
        int arr[]= {0,0,0,0,0};
       System.out.println(thirdLargest(arr));
    }
}
