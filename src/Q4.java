import java.util.Scanner;

public class Q4 {
    public static < E > void printArray( E[] inputArray){
        for(int i = 0 ; i < inputArray.length ; i++){
            System.out.print(inputArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer []Array = new Integer[5];
        Double []Array2 = new Double[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer array elements: ");
        for(int i = 0 ; i < Array.length ; i++){
            Array[i]= sc.nextInt();
        }
        System.out.print("Integer Array contains: ");
        printArray(Array);
        System.out.println();
        System.out.print("Enter double array elements: ");
        for(int i = 0 ; i < Array.length ; i++){
            Array2[i]= sc.nextDouble();
        }
        System.out.print("Double Array contains: ");
        printArray(Array2);

    }
}
