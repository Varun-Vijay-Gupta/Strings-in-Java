public class Basic_Str_Builder {
    public static void main(String[] args) {
        StringBuilder bd = new StringBuilder("varun gupta");
        System.out.println(bd);
        System.out.println(bd.charAt(0));
        bd.setCharAt(0, 'T');
        System.out.println(bd);

        bd.insert(1, 'a');
        System.out.println(bd);

        bd.append(" vijay");
        System.out.println(bd);

        
    }
}
