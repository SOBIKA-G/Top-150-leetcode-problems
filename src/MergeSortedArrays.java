import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Array 1 elements: ");
        int[] arr1 = new int[n1];
        for(int i = 0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in array 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Array 2 elements: ");
        int arr2[] = new int[n2];
        for(int i = 0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int i = n1-1;
        int j = n2-1;
        int[] res = new int[n1+n2];
        int k = n1+n2-1;
        while(i>=0 && j>=0){
            if(arr1[i] > arr2[j]){
                res[k--] = arr1[i--];
            }
            else{
                res[k--] = arr2[j--];
            }
        }
        while(i>=0){
            res[k--] = arr1[i--];
        }
        while(j>=0){
            res[k--] = arr2[j--];
        }
        for(int val:res){
            System.out.print(val+" ");
        }

    }
}
