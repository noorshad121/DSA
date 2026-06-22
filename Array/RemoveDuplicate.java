public class RemoveDuplicate {
    
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,4,4};
        int copyArr[] = new int[arr.length];
        int index = 0;

        for(int i = 0; i < arr.length; i++){

            boolean duplicate = false;

            for(int j = 0; j < index; j++){
                if(arr[i] == copyArr[j]){
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate){
                copyArr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < index; i++){
            System.out.print(copyArr[i] + " ");
        }
    }
}