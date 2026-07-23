public class reverse_string {
    
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original string: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("Reversed string: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}

