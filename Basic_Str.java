import java.util.Scanner;

public class Basic_Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        String First = "Varun";
        String name = "Varun";
        String Last = "Gupta";
        String Full = First + " " + Last;
        System.out.println(Full);
        System.out.println("length of string: "+ Full.length());

        // for(int i = 0; i < Full.length(); i++){
        //     System.out.println(Full.charAt(i));
        // }

        //System.out.println(First.equals(name)); // output -> true(if equals) and false(if not equal)
        //System.out.println(First.compareTo(Last)); // output -> 0(if equal), +ve value(if s1 > s2) and -ve value(if s1 < s2)

        System.out.println(Full.substring(6, Full.length()));

        String str = "123";
        int num1 = 123;
        int num =Integer.parseInt(str);
        String str1 = Integer.toString(num);
        System.out.println(num);
        System.out.println(str1);
        
    }
}
