import java.util.Scanner;

public class addValue {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of size : ");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i<array.length){
           array[i] = scanner.nextInt();
           i++;
        }
        System.out.print("Enter number to add : ");
        int x = scanner.nextInt();
        System.out.print("Enter number of index : ");
        int index = scanner.nextInt();
        if (index<=1&&index>array.length) System.out.print("Can not add !");
        else {
            for (int j = 0; j < array.length; j ++){
                if (array[j] == array[index]){
                    array[j] = x;
                }
            }
        }
        System.out.print("New array :");
        for (int j = 0; j < array.length; j ++){
            System.out.print(array[j] + "\t");
        }
    }
}
