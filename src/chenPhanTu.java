import java.sql.SQLOutput;
import java.util.Scanner;

public class chenPhanTu {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so can chen:");
        int X = sc.nextInt();
        System.out.println("nhap vi tri can chen:");
        int index = sc.nextInt();
        for (int i =index; i<arr.length;i++){
            arr[index+1]= arr[index];
        }
        arr[index]=X;
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
