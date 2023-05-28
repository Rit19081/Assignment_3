public class Q7 {
    public static int fact(int n){
        if(n == 1)
            return 1;
        else
            return n * fact(n -1);
    }
    public static int pow(int x, int n){
        if (n == 1)
            return x;
        else
            return x * pow(x,n-1);
    }
    public static int gcd(int x, int y){
        if(y == 0)
            return x;
        return gcd(y,x%y);
    }
    public static int dec_to_bin(int n){
        if(n == 1)
            return 1;
        else{
            int i = n/2;
            int bin = dec_to_bin(i)*10 + n%2;
            return bin;
        }
    }
    public static int product(int a, int b){
        if (b == 1)
            return a;
        else
            return a + product(a, b-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(pow(2,3));
        System.out.println(gcd(18,24));
        System.out.println(dec_to_bin(10));
        System.out.println(product(10,7));
    }
}
