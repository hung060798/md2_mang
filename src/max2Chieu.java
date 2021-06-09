import java.util.Scanner;

public class max2Chieu {
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
        int max = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]>max)
                    max = arr[i][j];
            }
        }
        System.out.println("max la:" + max);
    }
}
