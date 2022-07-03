package GFG.ArrayManipulation;

public class ZigZag {

    public static void main(String[] args) {
        ZigZag zz = new ZigZag();
        int[] arr = {4,3,7,8,6,2,1};
        zz.zigzag(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public void zigzag(int[] arr){
        int n = arr.length;
        boolean flag = true;
        for(int i=0; i<n-1; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr[i], arr[i + 1]);
                }
            }
            else{
                if(arr[i] < arr[i+1]){
                    swap(arr[i], arr[i+1]);
                }
            }
            if(flag == true)
                flag = false;
            else
                flag = true;
        }
    }

    public void swap(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }
}
