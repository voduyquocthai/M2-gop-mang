import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1;
        int array1[];
        int size2;
        int array2[];
        int size3;
        int array3[];
        Scanner sc = new Scanner(System.in);
        // array1
        do {
            System.out.print("Enter the size 1: ");
            size1 = sc.nextInt();
            if (size1 > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size1 > 20);
        array1 = new int[size1];
        int i = 0;
        while ( i < array1.length){
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + ":");
            array1[i] = sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array1));
        // array2
        do {
            System.out.print("Enter the size 2: ");
            size2 = sc.nextInt();
            if (size2 > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size2 > 20);
        array2 = new int[size2];
        int j = 0;
        while ( j < array1.length){
            System.out.println("Nhập vào phần tử thứ " + (j + 1) + ":");
            array2[j] = sc.nextInt();
            j++;
        }
        System.out.println(Arrays.toString(array2));
        //
        size3 = size1 + size2;
        array3 = new int[size3];
        for (int x = 0; x < array1.length; x++){
            array3[x] = array1[x];
        }
        for (int x = array1.length; x < array3.length; x++){
            array3[x] = array2[x-array1.length];
        }
        System.out.println(Arrays.toString(array3));
    }
}
