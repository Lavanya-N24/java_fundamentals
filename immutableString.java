public class immutableString {
    public static void main(String[] args) {
        String str1="java";
        str1.concat("programming");//this is called immutable no changes
        System.out.println(str1);
        //need changes we have to assign it to new string
        String str2=str1.concat("programming");
        System.out.println(str2);
    }
}
