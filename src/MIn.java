import java.util.Scanner;

public class MIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu:"  );
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i =0; i< arr.length;i ++){
            arr[i]= sc.nextInt();
        }
        int Min = arr[0];
        for (int i=1;i< arr.length;i ++){
            if (arr[i]<Min)
                Min = arr[i];
        }
        System.out.println(Min);
    }
}
