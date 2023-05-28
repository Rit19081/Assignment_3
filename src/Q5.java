import java.util.Scanner;
public class Q5 {
    public static <T> int count(T[] array, T item){
        int count = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(item .equals( array[i]))
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double [] arr = new Double[5];
        System.out.print("Enter array elements: ");
        for(int i = 0 ; i < arr.length ; i++){
           arr[i]= sc.nextDouble();
        }
        System.out.print("Enter the element to search: ");
        Double item = sc.nextDouble();
        System.out.println(count(arr, item));
    }
}
