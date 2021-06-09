import java.util.Scanner;

public class tongCOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap kich thuoc mang 1:");
        int leng1 = sc.nextInt();
        System.out.println("NHap kich thuoc mang 2:");
        int leng2 = sc.nextInt();
        int[][] arr = new int[leng1][leng2];
        for (int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.println("nhap phan tu");
                arr[i][j]= sc.nextInt();
            }
        }
        int tong=0;
        System.out.println("nhap cot can tinh tong");
        int x = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            tong+=arr[i][x];
        }
        System.out.println(tong);
    }
}
