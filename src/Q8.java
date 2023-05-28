public class Q8 {
    static int rev = 0;
    public static int reverse(int n){
        if(n == 0)
            return rev;
        else{
            int rem = n%10;
            rev = (rev*10) + rem;
            return (reverse(n/10));
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(105));
    }
}
