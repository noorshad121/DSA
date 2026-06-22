public class oth {

    public static void getoth(int arr[]) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            // Move left pointer if element is non-zero
            if (arr[l] != 0) {
                l++;
            }

            // Move right pointer if element is zero
            else if (arr[r] == 0) {
                r--;
            }

            // Swap when left is 0 and right is non-zero
            else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,0,0,0,2};
        getoth(arr);
    }
}