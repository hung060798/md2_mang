import java.util.Scanner;

public class demPtu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String chuoi = input.nextLine();
        System.out.println("Nhap kí tu");
        char X = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == X) {
                count++;
            }
        }
        System.out.println( count );
    }
}
