import java.util.Scanner;

public class Length_Of_String_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        
        String[] arr = new String[size];

        int length = 0;

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextLine();
            length = length + arr[i].length();
        }
        System.out.println("Lemgth of String array is: "+length);
    }
}
