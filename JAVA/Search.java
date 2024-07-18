import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter elements to the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to be searched: ");
        int s = sc.nextInt();
        
        int flag = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == s) {
                flag = 1;
                System.out.println(s + " is found in the array at position " + (i + 1));
                break;
            }
        }
        
        if(flag == 0) {
            System.out.println(s + " is not an element of the array.");
        }
        
    }
}
