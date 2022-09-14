import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int l= sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the Array");
        for (int i=0; i< arr.length; i++)
            arr[i]=sc.nextInt();

        int max=arr[0];
        for (int i=0; i< arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The largest value is: "+max);
    }
}
