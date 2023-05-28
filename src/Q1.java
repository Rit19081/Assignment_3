import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int n = sc.nextInt();
        if(n<0){
            try{
                throw new NumberFormatException("Negative Number");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else
            System.out.println("Your lucky number is " + n);

    }
}
