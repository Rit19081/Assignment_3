import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String []colours = new String[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four colours: ");
        for (int i = 0 ; i< colours.length ; i++){
            colours[i]= sc.next();
        }
        try{
            System.out.println("Convert string to integer");
            int s = Integer.parseInt(colours[0]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            System.out.println("Enter one more colour");
            colours[5]= sc.next();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("The colours entered are: ");
            for (int i = 0 ; i< colours.length ; i++){
                System.out.println(colours[i]);
            }
        }

    }
}
