public class Q10 {
    public static String reverse(String s){
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));

    }
}
