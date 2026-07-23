public class mutableString {
    //mutable:StringBuilder and StringBuffer both are same
    
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("java");
        str1.append("programming");//this is called mutable changes will be reflected
        System.out.println(str1);
        StringBuffer str2 = new StringBuffer("java");
        str2.append("programming");//this is called mutable changes will be reflected
        System.out.println(str2);
    }
}
