import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Varun");

        for(int i = 0; i < builder.length()/2; i++){
            int front = i;
            int back = builder.length() - 1 - i;

            char frontchar = builder.charAt(front);
            char backchar = builder.charAt(back);

            builder.setCharAt(front, backchar);
            builder.setCharAt(back, frontchar);
        }
        System.out.println(builder);
    }
}
