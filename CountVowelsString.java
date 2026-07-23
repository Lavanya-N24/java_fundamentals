public class CountVowelsString {
    public static void main(String arg[]){
        String str="hello world";
        int count=0;
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){count++;}}
        System.out.println("Number of vowels in the string: " + count);
count++;
    }
}
