import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2Darray {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(arrayInput()));

    }
    static int[][] arrayInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of Rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter the no. of Column: ");
        int column=sc.nextInt();
        int[][] arr=new int[rows][column];
        System.out.print("Enter the Element:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        search(arr,rows,column);
        return arr;
    }
  static void search(int[][] arr,int rows, int column){
        int max=arr[0][0];
        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){

                if(arr[i][j]>max)
                    max=arr[i][j];
            }
        }
      System.out.println("The max value of Array is "+max);

   }
}
