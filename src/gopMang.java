import java.util.Arrays;
public class gopMang {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] mang = new int[arr1.length+arr2.length];
        for (int i =0; i<arr1.length;i++){
            mang[i]= arr1[i];
        }
        int count = arr2.length;
        for (int i =0;i<arr2.length;i++){
            mang[count] = arr2[i];
            count++;
        }
        for(int i : mang){
            System.out.println(i);
        }
    }
}
