import java.util.Scanner;
class Student {
    String name;
    int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println(name + " has got " + mark);
    }
}
class MarksOutOfBoundException extends Exception{
    @Override
    public String getMessage() {
        return "Mark can't be greater than 100";
    }
}
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        Student detail = new Student(name,marks);
        try{
            if(detail.mark <=100)
                detail.display();
            else
                throw new MarksOutOfBoundException();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}

