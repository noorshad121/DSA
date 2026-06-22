public class target{
    public static int[] getTarget(int arr[], int target){
        int l = 0;
        int r = arr.length-1;
        while(l < r){
            if(arr[l] + arr[r] == target){
                return new int{arr[l], arr[r]};
            }
            else if(arr[l] + arr[r] < target) {
                l++;
            }
            else{
                r--;
            }
             
        }

        return new int{-1,-1};

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,7};

        System.out.println(getTarget(arr, 9));
    }
}