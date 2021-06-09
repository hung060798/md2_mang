import java.util.Scanner;

public class tongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhạp do dai ma tran vuong");
        int x = sc.nextInt();
        int total = 0;
        int[][] arr = new int[x][x];
        for(int i = 0; i< arr.length;i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.println("nhap phan tu");
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i =0;i<arr.length;i++){
                total += arr[i][i];
        }
        System.out.println(total);
    }
}
