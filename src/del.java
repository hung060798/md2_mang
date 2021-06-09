
import java.util.Scanner;

public class del {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index_del=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa:");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                index_del = i;
                break;
            }
        }
        if (index_del== arr.length-1){
            arr[index_del]=0;
        }
        for (int i=index_del ;i<arr.length-1;i++) {
            arr[i] = arr[i + 1];
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}