 import java.util.ArrayList;
public class ArrayList_ex {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        // add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        //get element at index 1
        list.get(1); // returns "Banana"
        //add element at index 1 in between
        list.add(1, "Date");
        System.err.println(list);
        //set element
        list.set(2, "Elderberry");
        System.out.println(list);
    }
}
//  ArrayList<Integer> list = new ArrayList<>();
//   ArrayList<Boolean> list = new ArrayList<>();