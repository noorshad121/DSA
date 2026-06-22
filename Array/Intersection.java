public class Intersection {

    public static int[] getInter(int arr1[], int arr2[]) {

        int i = 0; 
        int j = 0;
        int k = 0;
        int temp[] = new int[Math.min(arr1.length, arr2.length)];
        while (i < arr1.length && j < arr2.length) {
           
            if(arr1[i] == arr2[j]) {
               
                 if (k == 0 || temp[k - 1] != arr1[i]) {
                    temp[k++] = arr1[i];
                }
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            } 
            else {
                j++;
            }
        }

        int countArr[] = new int[k];
        for(int x = 0; x < k; x++){
            countArr[x] = temp[x];
        }
        return countArr;

        
    }

    public static void printArr(int []arr) {
        for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
         int[] arr1 = {1,2,3,4,5,5,6,7,8,8};
        int[] arr2 = {7,7,8,8,8,8};
           
       
        printArr( getInter(arr1, arr2));

    } 
}