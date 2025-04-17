import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elments in array");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to remove: ");
        int val = sc.nextInt();
        int i = 0;
        int j = 0;
        for(i = 0;i<n;i++){
            if(arr[i]!=val){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int k = 0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
